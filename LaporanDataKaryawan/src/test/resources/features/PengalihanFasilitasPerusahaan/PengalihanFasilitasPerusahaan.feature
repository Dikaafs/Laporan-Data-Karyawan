Feature: Pengalihan Fasilitas Perushaan
  sebagai user saya ingin mengalihkan fasilitas perusahaan pada pasangan sesama telkom
  sehingga pengajuan fasilitas perusahaan berhasil diajukan

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button

  @PengalihanFasilitasPerusahaan1
  Scenario: sebagai user saya dapat melakukan pengajuan pengalihan fasilitas perusahaan jika pasangan saya adalah sesama telkom
    And user diarahkan ke halaman form pengajuan fasilitas perusahaan
    And form pengalihan fasilitas perusahaan auto menginput nama dan nik pasutri telkom
    And user click submit
    And user click Checkbox
    And user click kirim pengajuan alih fasilitas perusahaan
    Then laporan pengajuan pengalihan fasilitas perusahaan berhasil disubmit

  @PengalihanFasilitasPerusahaan2
  Scenario: sebagai user saya tidak dapat melakukan pengajuan pengalihan fasilitas perusahaan jika pasangan saya bukan sesama telkom
    And user diarahkan ke halaman form pengajuan fasilitas perusahaan
    Then warning message jika karyawan bukan pasutri telkom berhasil ditampilkan

  @PengalihanFasilitasPerusahaan3
  Scenario: sebagai user saya dapat melihat status pengajuan pengalihan fasilitas perusahaan yang sudah saya ajukan
    And user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click halaman pengajuan
    And user click section laporan data karyawan
    And user click sub section alih fasilitas perusahaan
    Then progress pengajuan pengalihan fasilitas perusahaan berhasil ditampilkan
















