# Jawaban Pertanyaan pada Praktikum

## 1.4.1 Sequential Search
### 1. Fungsi kode program tersebut adalah untuk menampilkan data dan jumlah dari data tersebut.Data ini akan di tampilkan dengan isi array yang kita masukan di Main nya 8 setelah itu di tampilkan keseluruhan dari isi array tersebut.
### 2. Fungsi break tersebut adalah untuk menghentikan pencarian nilai data yang dicari jika sudah ketemu.
### 3. Masih barjalan,yah benar sekali,Karna pencarian yang dicari adalah nilai 30 dimana nilai tersebut berada pada indeks ke 2.Maksudnya adalah pencarian data dimana data dicari secara urut dari depan ke belakang atau dari awal sampai akhir. berdasarkan key yang di cari yaitu 30. Ini bisa terjadi karena isi dari array masih sama yaitu 8.

## 1.4.2 Binary Search
### 1. Tunjukkan pada kode program yang mana proses divide dijalankan!
<img src = 1.png>

### 2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
<img src = 2.png>

### 3. Jika array int data [] ={100,90,80,70,60,50,40,30} dan elemen yang dicari adalah 30. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai?
<img src = 9.png>

### Hasilnya adalah data tidak ditemukan, ini tidak sesuai, seharusnya data 30 ditemukan pada indeks ke-7, cara agar sesuai adalah mengubah kode program pada method FindBinarySearch() dengan mengubah operator logika lebih dari '>' menjadi kurang ari, ini dikarenakan data yang akan dilakukan pencarian sudah diurutkan dari yang terbesar ke terkecil.
<img src = 8.png>
<img src = 10.png>

### 4. Ubahlah array int data[] ={10,40,30,50,70,20,100,90}. Apakah program masih dapat berjalan? Mengapa demikian!
<img src = 7.png>

### Data 30 tidak ditemukan karena data tidak diurutkan terlebih dahulu dari data yang terkecil ke data yang terbesar. Jika tidak diurutkan maka program akan mengabaikan data yang seharusnya diperiksa.

### 5. Modifikasilah program diatas yang mana data array dapat di inputkan atau bersifat dinamis!
<img src = 4.png>
<img src = 6.png>

### Hasil run pada program :
<img src = 5.png>