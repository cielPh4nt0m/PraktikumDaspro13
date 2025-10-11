## JOBSHEET 5 PEMILIHAN

##### NAMA : FADILA MAYAMASITA
##### NIM  : 254107020012
##### KELAS: 1C_TI


PERCOBAAN 1 : PENERAPAN IF DAN IF-ELSE UNTUK MENCETAK KRS

##### soal :

1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operstor relasional ?

***Jawaban*** :
   
   karena ***IF*** bisa langsung mengevaluasi nilai boolean,status variabel, atau hasil fungsi tanpa perlu membandingkan dengna nilai tertentu. Penggunaan operator relasional tidak waji jika kondisi sudah berupa nilai boolean atau cukup jelas secara logika.


2. Saat program dijalankan, kemudian anda mengisikan nilai ***False**, Bagaimana hasilnya ?

***Jawaban*** :
   
 hasilnya tidak ada seperti pada gambar di bawah ini 
 <img width="1915" height="802" alt="Screenshot 2025-10-07 200943" src="https://github.com/user-attachments/assets/599c6669-1874-40e5-95c5-a32df4f09445" />


 3. Sistem perlu memberikan informais apabila pengguna memasukkan nilai false, maka terdapat keluaran "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu". Modifikasi program
 tersbeut dengan menambahkan struktur ELSE!

 ***Jawaban*** :
    
 Tampilannya akan seperti ini 
<img width="1146" height="570" alt="Screenshot 2025-10-08 110133" src="https://github.com/user-attachments/assets/45608556-2422-4eba-93a6-ab0688cac6be" />

Dan jika di RUN di terminal akan menampilkan seperti ini 

<img width="560" height="123" alt="Screenshot 2025-10-08 110318" src="https://github.com/user-attachments/assets/83d471c9-ad64-4b45-b48f-f66cdf757099" />

 4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi 
Percobaan 1”

***Jawaban*** :



PERCOBAAN 2 : SWITCH-CASE UNTUK MENCETAK KRS

##### Soal :

1. Apa fungsi dari Syntax _break_ ?
   
***Jawaban*** :
   
Syntax break digunakan untuk mengehnntikan atau keluar dari sebuah perulangan (loop) atau blok kontrol secara paksa,sebelum kondisi normalnya selesai
***Contoh penggunaan Syntax break pada codingan***

for (int i = o; i < 10; i++){
   if (i == 5){
      break; _keluar dari loop saat i = 5
   }
   System.out.println("i = " + i); 
}

2. Apa peran dari ***sintak default*** pada struktur pemilihan SWITCH-CASE?
   
***Jawaban*** :
   
syntax default dalam struktur pemilihan switch-case adalah sebagai penanganan terakhiir atau cadangan, jika tidak ada satu pun nilai case yang cocok dengna nilai yang di uji oleh switch

3. Buat file baru dengan nama ***ifElseCetakKRSNopresensi.java*** File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur switch-case yang telah fibuat ke dalam bentuk IF-ELSE IF-ELSE.
***Jawaban*** :
<img width="860" height="874" alt="Screenshot 2025-10-08 150438" src="https://github.com/user-attachments/assets/2551177d-6378-4176-a838-896252ea7a98" />

4.  Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi 
Percobaan 2”

***Jawaban*** :


PERCOBAAN 3 : NESTED IF UNTUK MENGECEK SYARAT UJIAN SKRIPSI
##### Soal :
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?

***Jawaban*** :
   
Jika user menjawab "No" maka program akan menampilkan pesan yaitu "Anda tidak dapat mengikuti ujian skripsi karena belum bebas kompen". Karena syarat utama untuk dapat mengikuti ujian adalah harus bebas kompen.

<img width="1501" height="856" alt="Screenshot 2025-10-09 135702" src="https://github.com/user-attachments/assets/67460c29-ba7f-4be9-b85b-5c95a73c5461" />

2. Jelaskan maksud dari potongan kode berikut!

***Jawaban*** :
   
Mengecek apakah input dari user sama dengan "ya" tanpa membedakan huruf besar ataupun kecil. Jika hasil true, maka program akan lanjut memeriksa syarat berikutnya.

4. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? jelaskan secara runtut untuk semua kondisi!

***Jawaban*** :

   Program meminta input apakah mahasiswa bebas kompen.
   Jika tidak bebas kompen maka langsung ditolak ikut ujian.
   jika mahasiswa bebas kompen maka lanjut memeriksa jumlah log bilangan pembimbing 1 & 2
   jika kedua log kedua >= 8 maka di perbolehkan ikkut ujian
   jika salah satu log bimbingan < 8 maka belum memenuhi syarat. Program akan menampilkan hasil akhir secara kondisi

6. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi percobaaan 3"

***Jawaban*** :





