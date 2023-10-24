

$(function () {
    console.log("Danh sacsh Question");
    getQuestions();
})

   

function getQuestions() {
    let examId = localStorage.getItem("examId");
    let typeQuestion = localStorage.getItem("typeQuestion");
    console.log(examId);
    


    //   ------------------------------------- API TÌM KIẾM Question -------------------------------------
    $.ajax({
        url: "http://localhost:8081/api/v1/questions/get/" + examId,
        type: "GET",

        contentType: "application/json",
        error: function (err) {
            console.log(err)
            confirm(err.responseJSON.message)
            alert("Error when loading data", err);
        },
        success: function (data) {
            console.log(data);
            
            fillQuestionsPage(data);

        }
    });
}

function fillQuestionsPage(json) {
    // check form trống để k lặp lại khi chuyền data
    $('#listQuestions').empty();

    console.log(json);

    json.vocQuestions.forEach(function (item) {

        $('#listQuestions').append(
            `<!-- bat dau mot chương mới-->
<div class="big_item" style="display: ${item.title ? 'block' : 'none'}">${item.title} </div>
<!-- bat dau mot chương mới-->
<!-- dong cau hoi -->
<div class="question_list">${item.qncontent} </div>
<div style="display:none" id="diemso1">1</div>
<!-- dong các đáp an -->
<div class="${item.typeAns}">
    <label class="container">
        <div class="answers" id="QS11">${item.ans1} </div>
        <input type="radio" value="${item.ans1} " name="QS1">
        <span class="checkmark"></span>
    </label>
    <label class="container">
        <div class="answers" id="QS12">${item.ans2}</div>
        <input type="radio" value="${item.ans2}" name="QS1">
        <span class="checkmark"></span>
    </label>
    <label class="container">
        <div class="answers" id="QS13">${item.ans3} </div>
        <input type="radio" value="${item.ans3}" name="QS1">
        <span class="checkmark"></span>
    </label>
    <label class="container">
        <div class="answers" id="QS14">${item.ans4}</div>
        <input type="radio" value="${item.ans4}" name="QS1">
        <span class="checkmark"></span>
    </label>
</div>

<!-- dong cau tra loi bi an di-->
<div style="display:none" id="AS1">${item.correct}</div>

<!-- dong cho biet cau nay thuoc kieu thi nao, tu vung hay doc hieu-->
<div style="display:none" id="type1">1</div>`
        )

    });
}



