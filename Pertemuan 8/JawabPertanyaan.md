# 8.3.3 Pertanyaan
## 1. Fungsi angka 4 (Stack(4)) adalah untuk mengisi size dari stack yang akan kita buat, dimana di dalam praktikum kita membuat isi sizenya 4 untuk menampung data tersebut.

## 2. Penambahan data angka 17 dan 98 pada program dan hasilnya.
<img src = 1.png>

## 3. Karena angka 98 merupakan top of stack dan pada proses pop terjadi pengambilan data teratas dan data top of stacknya adalah 98 pada saat telah diambil data tersebut barulah yang tercetak data 17 yang menjadi top of stack dan data tersebut masih berada didalam tumpukan karena tidak diambil menjadi isi dari stack tersebut.

## 4. Modifikasi program untuk dapat memasukkan data melalui keyboard.
<img src = 2.png>

## Dan hasilnya :

<img src = 3.png>

## 5. Karena pada mulanya isi top -1 karena array dimulai dari 0, yang berarti bahwa data stack dalam keadaan kosong.

# 8.4.3	Pertanyaan

## 1. Fungsi method precedence adalah untuk mengetahui tingkatan dari operator yaitu tingkat terbesar dan terkecil maksudnya dimana pangkat ‘^’ memiliki peringkat tertinggi dari operator lain, lalu pada operator modulo ‘%’ , bagi ‘/’ dan tambah ‘*’ merupakan operator yang memiliki satu tingkatan dibawah operator pangkat ‘^’. Sedangkan pada operator ‘-‘ dan operator ‘+’ merupakan satu tingkatan bagi dibawah dari modulo ‘%’, bagi ‘/’ dan kali ‘*’.

## 2. Masukkan ekpresi 5 ^ 2 + 8 / (6 – 2). Hasilnya adalah :
<img src = 4.png>
 
## 3.	Karena tanda kurung ‘(‘ dianggap tidak memiliki precedence, tanda kurung ‘(‘ hanya di pop tidak perlu dimasukkan ke postfix dan juga tanda kurung ‘(‘ tidak termaksud derajad operator aritmatika melainkan untuk :
## • Jika tanda ‘(‘, maka push ke stack.

## • Jika tanda ‘)’, maka pop isi stack sampai ditemukan tanda ‘(‘, kemudian ditambahkan ke postfix sedangkan tanda ‘(‘ tidak dimasukkan ke postfix.

## 4. Hasil penambahan operator @ :
<img src = 5.png>

## Hasil perubahan operator # :

<img src = 6.png>

## Operator @ dan # tidak dapat terbaca pada saat konversi karena pada method IsOperator tanda diatas tidak termasuk syarat atau ketentuan yang ada dalam method. Maka yang akan dijalankan oleh program adalah return false atau salah.