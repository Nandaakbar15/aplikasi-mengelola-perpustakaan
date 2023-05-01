-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 29 Jan 2023 pada 19.27
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftar_buku`
--

CREATE TABLE `daftar_buku` (
  `id` int(11) NOT NULL,
  `NO_BUKU` int(11) NOT NULL,
  `JUDUL` varchar(100) NOT NULL,
  `PENGARANG` varchar(50) NOT NULL,
  `PENERBIT` varchar(50) NOT NULL,
  `JENIS` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftar_buku`
--

INSERT INTO `daftar_buku` (`id`, `NO_BUKU`, `JUDUL`, `PENGARANG`, `PENERBIT`, `JENIS`) VALUES
(1, 1, 'Sejarah Indonesia', 'Yudhistira', 'PT_BUKU', 'SEJARAH'),
(2, 2, 'Detektif Conan', 'Aoyama Gosho', 'Gramedia', 'Komik');

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftar_koleksi`
--

CREATE TABLE `daftar_koleksi` (
  `id` int(11) NOT NULL,
  `NO_URUT` int(11) NOT NULL,
  `NO_BUKU` int(11) NOT NULL,
  `JUDUL` varchar(50) NOT NULL,
  `PENGARANG` varchar(50) NOT NULL,
  `PENERBIT` varchar(50) NOT NULL,
  `TH_TERBIT` int(20) NOT NULL,
  `JENIS` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftar_koleksi`
--

INSERT INTO `daftar_koleksi` (`id`, `NO_URUT`, `NO_BUKU`, `JUDUL`, `PENGARANG`, `PENERBIT`, `TH_TERBIT`, `JENIS`) VALUES
(1, 1, 1, 'Belajar Bahasa Indonesia', 'Joko Anwar', 'GRAMEDIA', 1999, 'Bahasa');

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftar_pinjam`
--

CREATE TABLE `daftar_pinjam` (
  `id` int(11) NOT NULL,
  `NO_BUKU` int(11) NOT NULL,
  `JUDUL` varchar(50) NOT NULL,
  `PENGARANG` varchar(50) NOT NULL,
  `JENIS` varchar(50) NOT NULL,
  `TANGGAL_PINJAM` date NOT NULL,
  `LAMA_PINJAM` varchar(30) NOT NULL,
  `STATUS` enum('PINJAM','KEMBALI') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftar_pinjam`
--

INSERT INTO `daftar_pinjam` (`id`, `NO_BUKU`, `JUDUL`, `PENGARANG`, `JENIS`, `TANGGAL_PINJAM`, `LAMA_PINJAM`, `STATUS`) VALUES
(3, 1, 'Detektif Conan', 'Gosho Aoyama', 'Komik', '2023-03-08', '3', 'PINJAM'),
(4, 2, 'Sejarah Indonesia', 'Yudhistira', 'Pelajaran', '2023-01-03', '3', 'KEMBALI');

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftar_pinjaman`
--

CREATE TABLE `daftar_pinjaman` (
  `id` int(11) NOT NULL,
  `NO_URUT` int(11) NOT NULL,
  `NO_ANGGOTA` int(11) NOT NULL,
  `NAMA_ANGGOTA` varchar(50) NOT NULL,
  `JUDUL_BUKU` varchar(50) NOT NULL,
  `TANGGAL_PINJAM` date DEFAULT NULL,
  `LAMA_PINJAM` varchar(30) NOT NULL,
  `STATUS` enum('PINJAM','KEMBALI') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftar_pinjaman`
--

INSERT INTO `daftar_pinjaman` (`id`, `NO_URUT`, `NO_ANGGOTA`, `NAMA_ANGGOTA`, `JUDUL_BUKU`, `TANGGAL_PINJAM`, `LAMA_PINJAM`, `STATUS`) VALUES
(1, 1, 1, 'Alvinda', 'Bahasa Indonesia', '2023-01-11', '3 Hari', 'PINJAM'),
(3, 3, 3, 'Nanda', 'Detektif Conan', '2023-01-13', '3 Hari', 'PINJAM');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_user`
--

CREATE TABLE `tabel_user` (
  `NAP` varchar(15) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `Role` varchar(10) NOT NULL,
  `NIK` varchar(16) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `NoHP` varchar(12) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabel_user`
--

INSERT INTO `tabel_user` (`NAP`, `email`, `password`, `Role`, `NIK`, `Nama`, `NoHP`, `alamat`) VALUES
('NAP0001', 'kandiaz@gmail.com', '123', 'Pustakawan', '123456789', 'Muhammad Kandiaz', '087123456789', 'Bandung'),
('NAP0002', 'alvinda@gmail.com', '123', 'Anggota', '123456789', 'Al-Vinda Akbar', '081123456789', 'Cimahi');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `daftar_buku`
--
ALTER TABLE `daftar_buku`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `daftar_koleksi`
--
ALTER TABLE `daftar_koleksi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `daftar_pinjam`
--
ALTER TABLE `daftar_pinjam`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `daftar_pinjaman`
--
ALTER TABLE `daftar_pinjaman`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tabel_user`
--
ALTER TABLE `tabel_user`
  ADD PRIMARY KEY (`NAP`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `daftar_buku`
--
ALTER TABLE `daftar_buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `daftar_koleksi`
--
ALTER TABLE `daftar_koleksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `daftar_pinjam`
--
ALTER TABLE `daftar_pinjam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `daftar_pinjaman`
--
ALTER TABLE `daftar_pinjaman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
