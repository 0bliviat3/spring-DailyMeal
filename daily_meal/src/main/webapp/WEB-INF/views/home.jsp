<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

<div style="position:absolute; top:25%; left:38.5%; text-align:center;">
	<form action = "inputInfo" method = "post" id="myInput">
		<div class="input-group mb-3">
		  <span class="input-group-text" id="basic-addon1">나이</span>
		  <input type="text" name="age" class="form-control" placeholder="나이" id="age">
		</div>
		<div class="input-group mb-3">
		  <span class="input-group-text" id="basic-addon1">키</span>
		  <input type="text"  name="height" class="form-control" placeholder="키"  id="height">
		</div>
		<div class="input-group mb-3">
		  <span class="input-group-text" id="basic-addon1">몸무게</span>
		  <input type="text"  name="weight" class="form-control" placeholder="몸무게"  id="weight">
		</div>
		<div class="input-group mb-3">
		  <span class="input-group-text" id="basic-addon1">성별</span>
		  <input type="text"  name="gender" class="form-control" placeholder="성별"  id="gender">
		</div>
		<div class="input-group mb-3">
		  <span class="input-group-text" id="basic-addon1">주당 운동 횟수</span>
		  <input type="text"  name="exerciseCnt" class="form-control" placeholder="주당운동횟수"  id="exerciseCnt">
		</div>
		<div class="input-group mb-3">
		  <span class="input-group-text" id="basic-addon1">하루 식사 횟수</span>
		  <input type="text"  name="mealCnt" class="form-control" placeholder="하루 식사 횟수"  id="mealCnt">
		</div>
		<input type="button" value="식단 생성하기" id="input_btn" class="btn btn-outline-primary">
		
	</form>
	 

</div>

</body>
</html>

<script type="text/javascript">
	$('#input_btn').on('click', () => {
		$('#myInput').submit();
		console.log(1);
	})
</script>
