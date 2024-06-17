Feature: Perpanjang Faskes Anak
  sebagai user saya ingin melakukan pengajuan perpanjang faskes anak
  sehingga faskes anak yang berusia 21th keatas dan dibawah 25th yang habis masa berlakunya dapat diperpanjang

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button

    @PerpanjangFaskes
  Scenario: sebagai user saya dapat melakukan perpanjangan faskes anak
      And user diarahkan ke form faskes
      And user memilih perpanjangan faskes anak
      And user click ubah data
      And user menginput nama anak yang memiliki tanggungan kesehatan dan ingin diperpanjang
      And Mandatory lain auto terinput
      And user click selanjutnya
      And user upload surat pernyataan rt rw untuk perpanjang faskes
      And user upload surat keterangan masih bersekolah untuk perpanjang faskes
      And user click simpan
      And user click kirim
      And user click Checkbox perpanjang faskes
      And user click kirim pengajuan perpanjang faskes
      Then pengajuan perpanjang faskes anak berhasil disubmit

    @PerpanjangFaskes2
    Scenario: sebagai user saya tidak dapat melakukan perpanjangan faskes anak jika anak belum terdaftar pada data anak di diarium
      And user diarahkan ke form faskes
      And user memilih perpanjangan faskes anak
      And user click ubah data
      And user menginput nama anak yang belum terdaftar pada diarium
      Then pesan opsi tidak tersedia berhasil ditampilkan

    @PerpanjangFaskes3
    Scenario: sebagai user saya tidak dapat mengubah data anak pada form pengajuan perpanjang faskes Anak
      And user diarahkan ke form faskes
      And user memilih perpanjangan faskes anak
      And user click ubah data
      And user menginput nama anak yang memiliki tanggungan kesehatan dan ingin diperpanjang
      And Mandatory lain auto terinput
      And user mencoba untuk mengubah mandatory tanggal lahir pada form pengajuan perpanjang faskes anak
      Then data yang ada pada mandatory tidak dapat diubah

    @PerpanjangFaskes4
    Scenario: sebagai user saya dapat melihat status pengajuan perpanjang fasilitas kesehatan yang sudah saya ajukan
      And user diarahkan ke dashboard page
      And user skip welcome pop up
      And user click halaman pengajuan
      And user click section laporan data karyawan
      And user click sub section perpanjang fasilitas kesehatan
      Then progress pengajuan perpanjang fasilitas kesehatan berhasil ditampilkan

	@PerpanjangFaskes5
    Scenario: sebagai user saya tidak dapat perpanjang faskes anak jika usia anak diatas 25th
      And user diarahkan ke form faskes
      And user memilih perpanjangan faskes anak
      And user click ubah data
      And user menginput nama anak yang sudah terdaftar pada diarium dengan usia lebih dari 25th
      Then nama anak diatas 25th menjadi disable

    @PerpanjangFaskes6
    Scenario: sebagai user saya tidak dapat perpanjang faskes anak jika anak yang bersangkutan tidak memiliki tanggungan faskes
      And user diarahkan ke form faskes
      And user memilih perpanjangan faskes anak
      And user click ubah data
      And user menginput nama anak yang tidak tertanggung fasilitas kesehatan
      Then nama anak yang tidak memiliki tanggungan faskes menjadi disable























