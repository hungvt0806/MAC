

$(function () {
    console.log("Danh sacsh Exam")
    getListExams()
})


function getListExams() {
    let level = localStorage.getItem("level")


    //   ------------------------------------- API TÌM KIẾM exam -------------------------------------
    $.ajax({
        url: baseUrlExams + "/level?level=" + level,
        type: "GET",

        contentType: "application/json",
        error: function (err) {
            console.log(err)
            confirm(err.responseJSON.message)
            alert("Error when loading data", err);
        },
        success: function (data) {
            console.log(data)
            fillExamsPage(data);

        }
    });
}

function fillExamsPage(json) {
    // check form trống để k lặp lại khi chuyền data
    $('#content-voc').empty();
    $('#content-read').empty();
    $('#content-listen').empty();
    console.log(json);
    // const level = json[0].level;
    $('h4').empty();
    $('h4').append(
        `<h4>List Exams JLPT ${json[0].level} </h4>`
    )




    json.forEach(function (item) {
        $('#content-voc').append(
            `<div class="col-4" >
            <button class="custom-btn btn-7" style="margin: 20px ;" onclick="navToQuestionsPage(${item.id}, 'VOC')"><span>${item.examName}</span></button></div>`
        )
        $('#content-read').append(
            `<div class="col-4" >
            <button class="custom-btn btn-12" style="margin: 20px ;" onclick="navToQuestionsPage(${item.id}, 'READ')"><span>Click!</span><span>${item.examName}</span></button></div>`
        )
        $('#content-listen').append(
            `<div class="col-4" >
            <button class="custom-btn btn-14" style="margin: 20px ;" onclick="navToQuestionsPage(${item.id}, 'LISTEN')">${item.examName}</button></div>`
        )
    });
}

let examId ;
let typeQuestion ;
// let baseUrlQuestions = "http://localhost:8081/api/v1/questions";

function navToQuestionsPage(examId, typeQuestion) {
    // Gans casc gti vao cac bien tim kiems
    localStorage.setItem("examId", examId);
    localStorage.setItem("typeQuestion", typeQuestion);
    console.log(examId, typeQuestion)
    $(".main").load("./assets/html/questions-page.html");
    
    
}