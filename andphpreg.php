<?php
$servername = "localhost";
$mysql_user = "root";
$mysql_pass ="";
$dbname = "coms_project";
$conn=mysqli_connect($servername, $mysql_user, $mysql_pass, $dbname);
if($conn){
	echo("connection successful\n");
}
else{echo("connection not successful\n");}

if($_SERVER['REQUEST_METHOD']=='POST'){
	$name = $_POST['name'];
	$add = $_POST['address'];
    $email = $_POST['email'];
    $pass = $_POST['password'];
    $user = $_POST['username'];
    $query = "INSERT INTO `andphpreg`(`name`, `address`, `email`, `username`, `password`) VALUES ('$name', '$add', '$email', '$user', '$pass')";

	if(mysqli_query($conn, $query)){
		echo("registration successful \n");
	}
	else{echo("registration unsuccessful\n");}
}
else{echo("error in request method\n");
}
?>