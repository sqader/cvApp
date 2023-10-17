<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>


<!-- Page Content-->
        <div class="container-fluid p-0">
            <!-- Experience-->
            <section class="resume-section" id="experience">
                <div class="resume-section-content">
                    <h2 class="mb-5">Experience</h2>

                    <c:forEach items="${expModel}" var="title">



                    <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                       <div class="flex-grow-1">
                            <h3 class="mb-0">${title.position}</h3>
                            <div class="subheading mb-3">${title.company}</div>
                        <p>Bring to the table win-win survival strategies to ensure proactive domination. At the end of the day, going forward, a new normal that has evolved from generation X is on the runway heading towards a streamlined cloud solution. User generated content in real-time will have multiple touchpoints for offshoring.</p>
                    </div>
                            <div class="flex-shrink-0"><span class="text-primary">March 2013 - Present</span></div>
                        <!-- Dodaj przycisk edycji -->
                        <a class="btn btn-success-small" href="<c:url value='/edit-experience/${title.id}'/>">Edytuj</a>
                    </div>
                    </c:forEach>


                </div>
            </section>
            <div class="container">
                <form method="post" action='<c:url value="/experience/addExperience"/>'>
                    <div class="form-group row">
                        <label class="col-2" for="exampleFormControlInput1">Pozycja</label>
                        <div class="col-10">
                            <input type="text" class="form-control" id="exampleFormControlInput1" name="psition" placeholder="uzupełnij tytuł">
                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-2" for="exampleFormControlInput2">Podtytuł</label>
                        <div class="col-10">
                            <input type="text" class="form-control" id="exampleFormControlInput2" name="company" placeholder="uzupełnij podtytuł">
                        </div>
                    </div>


                    <div class="form-group row">
                        <label class="col-2" for="exampleFormControlInput3">Treść</label>
                        <div class="col-10">
                            <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput3" name="data_start" placeholder="uzupełnij treść"></textarea>
                        </div>
                    </div>


                    <input type="submit" class="btn btn-success" value="Zapisz">
                </form>
            </div>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
