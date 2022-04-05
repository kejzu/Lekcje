<?php
echo 'Dodano rezerwację do bazy danych';

$db = mysqli_connect('localhost', 'root', '', 'baza');

$data = $_POST['data'];
$l_osob = $_POST['osoby'];
$n_tel = $_POST['tel'];

mysqli_query($db, "INSERT INTO rezerwacje (data_rez, liczba_osob, telefon) VALUES ($data, $l_osob, $n_tel);");

mysqli_close($db);
