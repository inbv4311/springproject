<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<meta charset="UTF-8" />
<style>
 /* 버튼 css */
   
   .button {
      display: inline-block;
      width: 200px;
      height: 54px;
      text-align: center;
      text-decoration: none;
      line-height: 54px;
      outline: none;
   }
   .button::before,
   .button::after {
      position: absolute;
      z-index: -1;
      display: block;
      content: '';
   }
   .button,
   .button::before,
   .button::after {
      -webkit-box-sizing: border-box;
      -moz-box-sizing: border-box;
      box-sizing: border-box;
      -webkit-transition: all .3s;
      transition: all .3s;
   }
   
   .button {
   background-color: #000;
   color: #fff;
   }
   .button:hover {
      letter-spacing: 5px;
   }
   #menu{
   width:615px;
   height:54px;
   padding-top:100px;
   padding-bottom:100px;
   margin: 0 auto;
   }
   #menu>.pdsli{
   float: left;
   margin-left:5px;
   }
</style>
<!-- 메뉴 목록  --> 
  <div id="menu">
       <c:forEach var="menu" items="${ menuList }" >
        <div class="pdsli">
          <a href="/PDS/List?menu_id=${ menu.menu_id }" class="button">
           ${ menu.menu_name }
          </a>
        </div>     
       </c:forEach>       
  </div>
   
   
   