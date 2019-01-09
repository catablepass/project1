<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : write
    Created on : 08.01.2019, 14:46:37
    Author     : catab
--%>

<sql:query var="authors" dataSource="jdbc/project1">
    SELECT name FROM webproject_db.authors
</sql:query>

<%@page contentType="text/html;charset=utf-8" pageEncoding="UTF-8" import="java.net.URLEncoder"%>
<!DOCTYPE html>
<html lang=en>
<head>
	<title>ИТ-Блокнот | Все лучшее для вас</title>
	<!--[if lt IE 9]><script src=http://html5shiv.googlecode.com/svn/trunk/html5.js></script><![endif]-->
	<link href=styles.css rel=stylesheet />
	<!--[if lt IE 9]><link href=ie.css rel=stylesheet /><![endif]-->
</head>

<body>
<header>
	<hgroup>
		<h1><a href=#>ИТ-Блокнот | Все лучшее для вас</a></h1>
		<h2>Блокнот с лучшими инструкциями</h2>
	</hgroup>
	<nav id=global>
		<ul>
			<li><a href="index.html">Главная</a></li>
			<li><a href="about-us.html">О нас</a></li>
			<li id=services>
				<a href="service.html">Services</a>
				<ul id=subMenu>
					<li><a href=#>Whatever</a></li>
					<li><a href=#>Your Heart</a></li>
					<li><a href=#>Desires</a></li>
				</ul>
			</li>	
		</ul>
	</nav>
</header>

<div class=clearfix>
  <div id=content>
      <form action="">
        <h1>Название статьи:</h1>
        <input name="title">
        <h1>Текст статьи:</h1>
        <textarea name="article"></textarea>
        <h1>Автор:</h1>
        <select name="author_id">
            <c:forEach var="row" items="${authors.rows}">
                <option value="${row.id}">${row.name}</option>
            </c:forEach>
        </select>  
        <input class=add_button type="submit" value="Опубликовать">
      </form>
      
      
  </div>
</div>


    
<footer class=clearfix>
		
	<p class=copyright>Copyright &copy; 2019 <strong>ЭВТ-16 бзу, Савельев А. Доброхотов В.</strong>. All Rights Reserved.</p>
</footer>

</body>
</html>
