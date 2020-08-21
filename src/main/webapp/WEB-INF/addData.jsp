<html>
<title>Add Users</title>
<body>
<h1>Hi! Mr. ${user}</h1><br>

<form action="search">
    <table>
        <tr>
            <td><input type="text" name="query"></td>
            <td><input type="submit" value="Search"></td>
        </tr>

    </table>
</form>
<form action="addToDB">
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id" value="${id}"/></td>
        </tr>
        <tr>
            <td>NAME:</td>
            <td><input type="text" name="name" value="${name}"/></td>
        </tr>
        <tr>
            <td> AGE: </td>
            <td><input type="text" name="age" value="${age}"/></td>
        </tr>
        <tr>
            <td>MOBILE:</td>
            <td><input type="text" name="mobile" value="${mobile}"/></td>
        </tr>
        <tr>
            <td>PASSWORD:</td>
            <td><input type="text" name="pwd" value="${pwd}"/></td>
        </tr>

    </table>
     <br>
    <input type="submit" values="Add Data into DB"><br>
</form>
<p> >> ${msg}</p>
</body>
</html>