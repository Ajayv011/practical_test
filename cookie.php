<?php
setcookie("username", "Ajay", time() + 3600, "/");
echo "Cookie set , go to next page.";
?>
<a href="page.php">next page</a>