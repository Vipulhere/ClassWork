
<?php  
$x = 5985;
//echo password_hash($x,PASSWORD_DEFAULT);
//$ecr='$2y$10$L2p7MbVblGRdJcQgttQ/uednkIbiF1ulfGBzrgAuvTEXAP1XANLJ.';
//password_verify("5985",$x);
if (password_verify(5985, '$2y$10$L2p7MbVblGRdJcQgttQ/uednkIbiF1ulfGBzrgAuvTEXAP1XANLJ.')) {
    echo "Password is valid.";
} else {
    echo "Password is invalid.";
}
?>  
