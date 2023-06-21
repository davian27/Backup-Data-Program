<?php
class Laptop {
    var $pemilik;

    function hidupkan_laptop() {
        $this->pemilik = "Muhammad Saleh Solahudin";
        return "Laptop Dihidupkan";
    }
}

$laptop = new Laptop();
$result = $laptop->hidupkan_laptop();
echo $result;
echo "<br>";
echo $laptop->pemilik;
?>
