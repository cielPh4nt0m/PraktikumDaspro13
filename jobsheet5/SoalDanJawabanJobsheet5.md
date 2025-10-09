## JOBSHEET 5 PEMILIHAN

##### NAMA : FADILA MAYAMASITA
##### NIM  : 254107020012
##### KELAS: 1C_TI


PERCOBAAN 1 : PENERAPAN IF DAN IF-ELSE UNTUK MENCETAK KRS
##### soal :
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operstor relasional ?
***Jawaban*** : 
   karena ***IF*** bisa langsung mengevaluasi nilai boolean,status variabel, atau hasil fungsi tanpa perlu membandingkan dengna nilai tertentu. Penggunaan operator relasional tidak waji jika kondisi sudah berupa nilai boolean atau cukup jelas secara logika
<img width="1146" height="570" alt="Screenshot 2025-10-08 110133" src="https://github.com/user-attachments/assets/b1587a0b-0716-4011-94a1-579cde43c8a6" />

2. Saat program dijalankan, kemudian anda mengisikan nilai ***False**, Bagaimana hasilnya ?
***Jawaban*** :
 hasilnya tidak ada seperti pada gambar di bawah ini 
 

 3. Sistem perlu memberikan informais apabila pengguna memasukkan nilai false, maka terdapat keluaran "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu". Modifikasi program tersbeut dengan menambahkan struktur ELSE!
 ***Jawaban*** :
 Tampilannya akan seperti ini 

Dan jika di RUN di terminal akan menampilkan seperti ini 



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



PERCOBAAN 3 : NESTED IF UNTUK MENGECEK SYARAT UJIAN SKRIPSI
##### Soal :
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
***Jawaban*** : Jika user menjawab "No" maka program akan menampilkan pesan yaitu "Anda tidak dapat mengikuti ujian skripsi karena belum bebas kompen". Karena syarat utama untuk dapat mengikuti ujian adalah harus bebas kompen.

2. Jelaskan maksud dari potongan kode berikut!
***Jawaban*** : Mengecek apakah input dari user sama dengan "ya" tanpa membedakan huruf besar ataupun kecil. Jika hasil true, maka program akan lanjut memeriksa syarat berikutnya.

3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? jelaskan secara runtut untuk semua kondisi!
***Jawaban*** : Program meminta input apakah mahasiswa bebas kompen.
               Jika tidak bebas kompen maka langsung ditolak ikut ujian.
               jika mahasiswa bebas kompen maka lanjut memeriksa jumlah log bilangan pembimbing 1 & 2
               jika kedua log kedua >= 8 maka di perbolehkan ikkut ujian
               jika salah satu log bimbingan < 8 maka belum memenuhi syarat. Program akan menampilkan hasil akhir secara kondisi




