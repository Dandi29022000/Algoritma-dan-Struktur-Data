# Pertemuan 13 - Double Linked Lists
# 11.3.3 Pertanyaan Percobaan
## 1. Jelaskan pengertian dari double linked lists!
Jawab : Double Linked List adalah linked list dengan node yang memiliki data dan dua buah reference link (biasanya disebut next dan prev) yang menunjuk ke node sebelum dan node sesudahnya. Memiliki dua buah pointer pembantu yaitu head dan tail.

## 2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?
Jawab : Menunjuk ke node sebelum (prev) dan node sesudahnya (next).

## 3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
<img src = Capture.PNG>

Jawab : head = menunjukkan bahwa isi linked lists masih kosong dan size berarti bahwa node masih 0.

## 4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
## Node newNode = new Node(null, item, head);
Jawab : Karena pada method tersebut berisi perintah addfirst dimana penambahan/pengisian data awal pada linked lists dan belum memiliki nilai prev.

## 5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
Jawab : Arti dari head.prev = newNode artinya prev dari node head yang lama akan menjadi node yang baru dan berada paling depan (sebelum head yang lama).

## 6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?
## Node newNode = new Node(current, item, null);
Jawab : Terdapat perulangan mencari data terakhir yang disimpan dalam atribut current,
lalu saat menambahkan node yang baru diakhir, program akan otomatis menambahakan
newNode.

# 11.4.3 Pertanyaan Percobaan
## 1. Apakah maksud statement berikut pada method removeFirst()?
## head = head.next;
## head.prev = null;
Jawab : Berfungsi untuk menghapus nilai awal dan statement head = head.next bahwa head yang bernilai awal null setelah dirubah akan mengisi nilai pada statement head.next menjadi prev dan head.prev = null untuk mengubah nilai prev head yang baru menjadi node paling awal.

## 2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
Jawab : Menggunakan perulangan while(current.next.next != null) untuk mencari data current.

<img src = 1.PNG>

## 3. Jelaskan fungsi kode program berikut ini pada fungsi remove!
<img src = 1.PNG>

Jawab : Fungsi kode program tersebut pada method remove() 
yaitu current.prev.next = current.next berfungsi 
untuk mengubah node next pada node sebelum current 
diubah menjadi node current.next, sehingga node 
current diabaikan dan next dari node sebelum current 
langsung menunjuk pada node setelah current current.
next.prev = current prev berfungsi untuk mengubah 
node prev pada node setelah current diubah menjadi 
node current.prev, sehingga node current diabaikan 
dan prev dari node setelah current langsung menunjuk 
pada node sebelum current.

# 13.5.3 Pertanyaan Percobaan
## 1. Apakah kegunaan method size() pada class DoubleLinkedLists ?
Jawab : Kegunaan mehod size() yaitu mengetahui size atau jumlah dari seluruh node yang ada pada linked list lalu nilainya dikembalikan pada pemanggilan method tersebut dengan tipe data ini.

## 2. Indeks pada linked lists yang telah dibuat dalam praktikum, menunjukkan bahwa linked lists dimulai pada indeks ke-0 atau 1? Jelaskan!
Jawab : Indeks pada linked list dimulai dari 0, indeks 
ini tergantung pada inisiasi perulangannya, apakah 
dimulai dari 0 atau 1, pada percobaan yang telah 
dilakukan, perulangannya dimulai dari 0, hal ini 
dapat kita ketahui melalui method add(), remove(), 
dan get() dengan inisialisasi i = 0.

## 3. Jelaskan perbedaan fungsi Add pada Double Linked Lists dan Single Linked Lists! Kemudian tunjukkan perbedaannya pada kode program!
Jawab : Ada perbedaan antara fungsi Add pada double linked 
list (DLL) dan single linked list (SLL). Pada DLL 
dilakukan pengubahan pada 2 atribut pada node yaitu 
pengubahan atribut prev dan next, sedangkan pada SLL 
dilakukan pengubahan hanya 1 atribut yaitu atribut 
next saja, perbedaan dapat terlihat dari potongan 
kode program berikut :

DLL :

<img src = 2.PNG>

SLL :

<img src = 3.PNG>


