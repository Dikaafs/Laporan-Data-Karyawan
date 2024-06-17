Feature: Pengalihan Faskes Anak
  sebagai user saya ingin mengalihkan fasilitas kesehatan
  dari anak yang akan berusia diatas 25th dan memiliki tanggungan kesehatan
  ke anak yang berusia 25th kebawah dan masih belum memiliki tanggungan kesehatan
  sehingga tanggungan faskes tetap aktif dan dapat dialihan ke anak yang berusia dibawah 25th

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button

    @PengalihanFaskes
  Scenario: sebagai user saya dapat membuat pengajuan pengalihan faskes anak ketika jumlah anak saya 3 atau lebih
    And user diarahkan ke form faskes
    And user memilih pengalihan faskes anak
    And user click ubah data
    And user memilih salah satu nama anak untuk dilakukan pencabutan hak faskes ketika status faskes tertanggung telkom
    And user click selanjutnya
    And user memilih salah satu nama anak untuk dilakukan pemberian hak faskes ketika status faskes tidak tertanggung dan usia kurang lebih 21th
    And user upload surat pernyataan rt rw
    And user upload surat keterangan masih bersekolah
    And user click lanjutkan
    And user upload surat pernyataan pengalihan faskes anak
    And user click simpan
    And user click kirim
    And user menyetujui pernyataan
    And user click kirim pengajuan
    Then pengajuan pengalihan faskes anak berhasil tersubmit

    @PengalihanFaskes2
    Scenario: sebagai user saya tidak dapat membuat pengajuan pengalihan faskes anak jika jumlah anak dibawah 3
      And user diarahkan ke form faskes
      And user memilih pengalihan faskes anak
      Then warning message bahwa saya tidak dapat melakukan pengajuan pengalihan faskes anak jika anak terhitung masih dibawah 3 berhasil muncul

    @PengalihanFaskes3
    Scenario: sebagai user saya dapat melihat status pengajuan pengalihan fasilitas kesehatan yang sudah saya ajukan
      And user diarahkan ke dashboard page
      And user skip welcome pop up
      And user click halaman pengajuan
      And user click section laporan data karyawan
      And user click sub section pengalihan fasilitas kesehatan
      Then progress pengajuan pengalihan fasilitas kesehatan berhasil ditampilkan

    @PengalihanFaskes4
    Scenario: sebagai user saya dapat membuat pengajuan pengalihan faskes anak ke 2 kali
      And user diarahkan ke form faskes
      And user memilih pengalihan faskes anak
      And user click ubah data
      And user memilih salah satu nama anak ke 2 untuk dilakukan pencabutan hak faskes
      And user click selanjutnya
      And user memilih salah satu nama anak ke 2 untuk dilakukan pemberian hak faskes
      And user upload surat pernyataan rt rw
      And user upload surat keterangan masih bersekolah
      And user click lanjutkan
      And user upload surat pernyataan pengalihan faskes anak
      And user click simpan
      And user click kirim
      And user menyetujui pernyataan
      And user click kirim pengajuan
      Then pengajuan pengalihan faskes anak berhasil tersubmit

    @PengalihanFaskes5
    Scenario: sebagai user saya tidak dapat membuat pengajuan pengalihan faskes anak ke 3 kalinya
      And user diarahkan ke form faskes
      And user memilih pengalihan faskes anak
      Then warning message bahwa saya sudah melakukan 2 kali transaksi pengalihan faskes anak berhasil muncul

    @PengalihanFaskes6
    Scenario: sebagai user saya tidak dapat membuat pengalihan faskes anak jika status tanggungan faskes tidak tertanggung ketika ingin mencabut hak faskes
      And user diarahkan ke form faskes
      And user memilih pengalihan faskes anak
      And user click ubah data
      And user memilih salah satu nama anak untuk dilakukan pencabutan hak faskes ketika status faskes tidak ditanggung
      And user click selanjutnya
      And user memilih salah satu nama anak untuk dilakukan pemberian hak faskes ketika status faskes tidak tertanggung dan usia kurang lebih 21th
      And user upload surat pernyataan rt rw
      And user upload surat keterangan masih bersekolah
      And user click lanjutkan
      And user upload surat pernyataan pengalihan faskes anak
      And user click simpan
      And user click kirim
      And user menyetujui pernyataan
      And user click kirim pengajuan
      Then pengajuan pengalihan faskes anak berhasil tersubmit
















