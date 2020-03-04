# Jawaban Pertanyaan Pratikum 1, 2 dan 3
## 1) Tampilkan hasil input array yang telah dilakukan pada praktikum bagian 1!
<img src = '1.PNG'>

## 2. Kenapa pada praktikum bagian 2 perlu di buat objek sebanyak 2 kali dari class minMax?
<img src = '2.PNG'>

Karena 2 objek tersebut bertujuan untuk mencari pencarian nilai maksimal dan minimal yang diambil
dari array yang dimulai dari indeks ke – 0 pada class lain sesuai degan inputannya sebanyak 5 elemen.

## 3. Buatlah perhitungan nilai minimal dan maksimal terpisah dari class main. Class main hanya untuk input dan menampilkan saja! 
<img src = '3.PNG'>
<img src = '4.PNG'>
<img src = '5.PNG'>

## 4. Apakah arti angka 4 pada kode berikut :
<img src = '6.PNG'>

Arti kode tersebut adalah sebagai berikut :

➢ Arr merupakan parameter int array sesuai dengan inputan.

➢ 0 merupakan parameter int indeks awal dari array, yang memandakan bahwa
array dimulai dari 0.

➢ 4 merupakan parameter int indeks akhir dari array,yang menandakan titik
maksimum elemen array.

➢ Hasil merupakan parameter int hasil yang digunakan untuk menampilkan nilai
maksimum maupun nilai minimum.

## 5. Kenapa pada pencarian min max dengan algoritma kita memerlukan nilai indeks awal, indeks akhir dan indeks tengah? 
➢ Indeks awal : berfungsi sebagai upa-masalah kiri yang diawali dengan angka 0.

➢ Indeks akhir : berfungsi sebagai upa-masalah kanan yang diakhiri dengan angka 4.

➢ Indeks tengah : berfungsi sebagai pivot untuk membagi value dan melakukan
perbandingan perhitungan antara indeks awal dan indeks akhir.

## 6. Apakah class Maxmin harus terpisah sepeti ini?Mengapa?
<img src = '5.PNG'>

Karena jika terpisah dan dijadikan dalam satu class, maka variable global tersebut tidak dapat terbaca
oleh fungsi main pada class itu sendiri, sehingga harus dibuatkan field pada class lainnya.

## 7. Pada tahap 4 praktikum bagian 3 apakah bisa dilakukan tanpa menyimpan nilai array of object ke dalam array “arr”?
Jika dihilangkan maka tidak dapat menyimpan, karena “arr” merupakan parameter dari deklarasi array
dari int [] arr, yang berfungsi untuk menyimpan inputan dari array tersebut melalui library scanner atau
inisialisasi nilai yang diberikan. Hal ini bias diterapkan jika menggunakan metode brute force.

## 8. Jika tahap 7 bisa dilakukan, bagaimana perubahan kode program secara keseluruhan! 
<img src = '7.PNG'>

Bisa langsung memasukkan nilai Array ke parameter pertama, dengan mengubah objek nilai Array ke Array biasa di main.
<img src = '9.PNG'>

## 9. Ubahlah praktikum bagian 4 dengan method tanpa nilai kembalian! 
<img src = '10.PNG'>
<img src = '11.PNG'>

## 10. Manakah yang lebih baik, algoritma brute force atau divide conquer?Jelaskan!
Algoritma yang lebih baik adalah berdasarkan case yang ditangani, metode brute force merupakan
metode yang cocok digunakan untuk perbandingan nilai karena value dijalankan dengan sekali jalan,
sedangkan metode divide conquer merupakan metode yang cocok digunakan untuk pencarian nilai
dikarenakan metode ini memecah beberapa masalah menjadi bermacam – macam upa-masalah.

## 11. Pada praktikum 3 apakah kegunaan tanda “:” pada potongan code program bagian berikut :
<img src = '8.PNG'>
Kegunaannya adalah sebagai handler dari kedua pernyataa pada masing-masing variable. Dan
berfungsi untuk menyederhanakan dan menghemat penggunaan variable pada saat ditampilkan pada
output.

## 12. Dengan melihat soal no 11, jelaskan pula tujuan penggunaan tanda “?” ! 
Kegunaannya adalah sebagai operator pembanding antara kedua nilai baik hasil.minimum
maupun hasil.maksimum. 

# Jawaban Pertanyaan Praktikum 4
## 1. Berdasarkan kode pada Praktikum 4 di atas, Jika perulangan kedua pada kode di atas berubah menjadi
<img src = '12.PNG'>

## Tulislah notasinya berdasarkan perubahan tersebut!
Notasi Big O

O(n x n x 1)

O(n^2)

## 2. Berdasarkan notasi yang ditentukan pada nomor 1, hitunglah jumlah instruksi jika n = 100!
<img src = '13.PNG'>
Jumlah instruksi :

O(n x n x 1)

O(100 x 100 x 1) 

O(10000)

Penjelasan :

O(1 + 1 + n x n x 1 + n x n x 1)

O(2 + n^2 + n^2)

O(2 + 2 * n^2)

O(2 + 2 x 100^2)

O(2 + 20000)

O(20002)

## 3. Apakah terdapat perbedaan notasi di antara kedua kode (kode A dan Kode B) program berikut? Berikan penjelasan dari alasan yang di kemukakan!
Perbedaan antara kode A dengan kode B terdapat pada iterasi yang digunakan. Kode A menggunakan
notasi O(np
) pada variable iterasinya sendiri, dan kode B menggunakan notasi O(np
) pada iterasi dari kdoe A. Selain
itu pada kode A perulangan akan dijalankan sesuai dengan banyaknya inisialisasi maupun nilai yang diinputkan,
dan pada iterasi j++ merupakan titik pembatas dari perulangan itu sendiri pada kode A. Sedangkan pada kode B,
perulangan akan dijalankan sesuai dengan banyaknya nilai yang di inputkan atau diinisialisasikan akan tetap jika
menggunakan iterasi i++ pada perulangan j maka perulangan akan terus dijalankan tanpa adanya perberhentian
yang sesuai dengan variable itu sendiri atau disebut juga unlimited loop.