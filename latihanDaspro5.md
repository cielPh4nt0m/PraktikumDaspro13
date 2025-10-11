# LATIHAN DASPRO 5

## NAMA : FADILA MAYAMASITA
## NIM  : 254107020012
## KELAS: 1C_TI

1. Sistem perpustakaan kampus memberikan izin masuk dengan dua syarat:
 • Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi 
online, maka boleh masuk.
 • Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk.
 Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!
**Jawaban** :
*Flowchart* :
<img width="2720" height="1000" alt="image" src="https://github.com/user-attachments/assets/3ead0902-4115-4135-96d0-4cc77e8212c0" />
*Pseudocode* :
### Deklarasi:
  kartuMahasiswa : Boolean
  registrasiOnline : Boolean

Mulai
  // Input
  Tampilkan "Apakah membawa kartu mahasiswa? (true/false)"
  Input kartuMahasiswa

  Tampilkan "Apakah sudah registrasi online? (true/false)"
  Input registrasiOnline

  // Proses dan Output
  Jika (kartuMahasiswa = true) atau (registrasiOnline = true) maka
    Tampilkan "Boleh masuk ke perpustakaan"
  Jika tidak
    Tampilkan "Ditolak masuk ke perpustakaan"
    
Selesai

 2. Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas
 akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:
 • Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”.
 • Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS 
yang diambil:
 o Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”.
 o Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.
 • Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”.
 Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!
**Jawaban** :
*Flowchart* :
<img width="2512" height="1000" alt="image" src="https://github.com/user-attachments/assets/0a7e217f-9911-49b0-8ad9-7bd7e61335fa" />
### *Pseudocode* :
Deklarasi:
    jenis_pengguna : string
    jumlah_sks : integer

Input:
    Tampilkan "Masukkan jenis pengguna (dosen/mahasiswa/lain): "
    Baca jenis_pengguna

Proses dan Output:
    Jika jenis_pengguna = "dosen" maka
        Tampilkan "Akses WiFi diberikan (dosen)"
    Jika tidak, dan jenis_pengguna = "mahasiswa" maka
        Tampilkan "Masukkan jumlah SKS yang diambil: "
        Baca jumlah_sks
        Jika jumlah_sks >= 12 maka
            Tampilkan "Akses WiFi diberikan (mahasiswa aktif)"
        Jika tidak maka
            Tampilkan "Akses ditolak, SKS kurang dari 12"
    Jika tidak maka
        Tampilkan "Akses ditolak"
        Selesai




