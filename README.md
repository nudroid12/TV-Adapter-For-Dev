# TvAdapterForDev

Kod Android View untuk menguji UI Android TV pada telefon semasa pembangunan.
Adapter menggunakan hierarki UI TV yang diberikan oleh app, mengukurnya pada
saiz viewport yang dibekalkan dan mengecilkan keseluruhan paparan secara seragam.
Remote atas skrin boleh dialih dan diubah saiz, dengan D-pad, OK dan Back.

## Integrasi dalam branch app

1. Masukkan `src/main/java/com/nudroidlabs/tvadapter/TvAdapter.java`
   ke dalam source set modul Android app.
2. Dalam Activity TV, bina hierarki View sedia ada sebelum ia dipasang
   pada window. Jika preview aktif dan `TvAdapter.isTelevision(this)` bernilai
   `false`, gunakan Activity dalam landscape dan pasang hierarki tersebut
   dengan `setContentView(new TvAdapter(this, tvContent, widthPx, heightPx))`.
   `tvContent` mesti belum ada parent. Ambil saiz viewport yang sepadan dengan
   konfigurasi TV sasaran, dalam piksel sebelum skala.
3. Pada Android TV sebenar, pasang UI melalui laluan Activity TV asal.
   Integrasi pertama akan dibuat dalam branch `tvlink`.

## Skop versi awal

Adapter ini mengubah ukuran View dan skala paparan. Android masih menggunakan
konfigurasi peranti yang menjalankan app, termasuk density, pemilihan resource
dan versi sistem. Sepadan dengan TV perlu disahkan menggunakan app sasaran.
