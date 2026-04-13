<?php
if (isset($_COOKIE['username'])) {
  echo "Username: " . $_COOKIE['username'] . "!";
} else {
  echo "cookie is not found";
}
?>
<?php
setcookie("user", "Ajay", time() + 3600, "/");
echo "Cookie is set for 1 hour.";
if (isset($_COOKIE['user'])) {
  echo "<br> cookie value: " . $_COOKIE['user'] . "!";
} else {
  echo "<br> cookie expired or not set.";
}
?>
<?php
setcookie("name", "Ajay", time() + 3600, "/");
setcookie("email", "Ajay@gmail.com", time() + 3600, "/");
echo "Cookies set <br>";
if (isset($_COOKIE['name']) && isset($_COOKIE['email'])) {
  echo "Name: " . $_COOKIE['name'] . "<br>";
  echo "Email: " . $_COOKIE['email'] . "<br>";
} else {
  echo "Cookies  not available.";
}
?>
<?php
if (isset($_COOKIE['username'])) {
  echo "COOKIE VALUE: " . $_COOKIE['username'];
} else {
  echo "cookie is not found";
}
?>
<?php
setcookie("username", "", time() - 3600, "/");
?>