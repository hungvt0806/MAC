let zooms = [];
let pageSizeZoom = 10;
let pageNumberZoom = 1;
let sortBy = "id";
let sortType = "DESC";
let questionName = "";
let examId = 0;
let level;
let typeQuestion;
let examName = "";
let yearMonth = "";


let baseUrlQuestions = "http://localhost:8081/api/v1/questions";
let baseUrlExams = "http://localhost:8081/api/v1/exam";

function SearchExamRequest(examName,examId,yearMonth,level,typeQuestion, pageSizeZoom, pageNumberZoom, sortBy, sortType){
    this.examName = examName;
    this.examId = examId;
    this.yearMonth = yearMonth;
    this.level = level;
    this.typeQuestion = typeQuestion;
    this.page = pageNumberZoom;
    this.size = pageSizeZoom;
    this.sortField = sortBy;
    this.sortType = sortType;
    }

    $(function () {
        console.log(13123)
        buildExamsPage();
        buildYMExamSearch();
    })
    
    function buildExamsPage() {
        zooms = [];
        getListExams();
    }
    function buildYMExamSearch(){
        $.ajax({
            url: "http://localhost:8081/api/v1/exam",
            type: "GET",
            contentType: "application/json",
            //data: JSON.stringify(request),
            error: function (err) {
              console.log(err)
              confirm(err.responseJSON.message)
              alert("Error when loading data",err);
            },
            success: function (data) {
                console.log(data)
              fillYMExamsToSearch(data);
            }
          });
    }
    
    function fillYMExamsToSearch(data){
        $('#inputYearMonth').empty();
        console.log(data);
        $('#inputYearMonth').append('<option value="">YearMonth</option>')
        data.forEach(function (item) {
            $('#inputYearMonth').append(
                `<option value="${item.id}">${item.examName.substring(0,6)}</option>`
                )});
    }
    
    // gọi api GetAllExams

async function getListExams() {
    let request = new SearchExamRequest(examName,examId,yearMonth,level,typeQuestion, pageSizeZoom, pageNumberZoom, sortBy, sortType);
    //   ------------------------------------- API TÌM KIẾM PRODUCT -------------------------------------
  $.ajax({
    url: baseUrlExams + "/searchexam",
    type: "POST",
    
    contentType: "application/json",
    data: JSON.stringify(request),
    error: function (err) {
      console.log(err)
      confirm(err.responseJSON.message)
      alert("Error when loading data",err);
    },
    success: function (data) {
        console.log(data)
      fillYMExamsToTable(data.content);
      buildPaginationQuestion(data.number + 1, data.totalPages);
    }
  });

    
    // var url = "http://localhost:8080/api/v1/class?sortByClassName=true&sortByStartDate=true";
    // $.get(url, function (data, status) {
    //     //error
    //     if (status == "error") {
    //         alert("Error when loading data");
    //         return;
    //     }
    //     class_s = data;
    //     console.log(class_s);
    //     filltoTable();
    // });
    // fetch('./assets/data/zoom.json')
    //     .then((response) => response.json())
    //     .then((json) => {
    //         fillZoomToTable(json.content);
    //         buildPaginationZoom(json.number + 1, json.totalPages);
    //     }
    //     );
}


function searchListExams() {
    // Gans casc gti vao cac bien tim kiems
    examName = document.getElementById("searchExam").value;
    
    let inputLevel = document.getElementById("inputLevelExam").value;
    level = inputLevel ? inputLevel : null ;
    
    let inputTypeQuestion = document.getElementById("inputTypeQuestionExam").value;
    typeQuestion = inputTypeQuestion ? inputTypeQuestion: null;
    
    let inputYearMonth = document.getElementById("inputYearMonth").value;
    yearMonth = inputYearMonth ? inputYearMonth : "";
    console.log(examName, level, typeQuestion, yearMonth)
    getListExams();
    
    }
    
    function fillYMExamsToTable(json) {
        // check form trống để k lặp lại khi chuyền data
        $('#examBody').empty();
        var index = 1;
        console.log(json);
        json.forEach(function (item) {
            $('#examBody').append(
                '<tr>' +
                '<td>' + (index++) + '</td>' +
                '<td>' + item.yearMonth + '</td>' +
                '<td>'+item.level+'</td>' +
                '<td>' + item.examName.substring(8)+ '</td>' +
                '<td>' + item.examName + '</td>' +
                '<td>' + item.duration + '</td>' +
                '<td>' +
                '<a class="edit" title="go to  detail" data-toggle="tooltip" onclick="editZoom(' +
                item.id + ')"><i class="ti-pencil m-1 text-warning" style="font-size:24px; cursor: pointer;"></i></a>' +
                '<a class="edit" title="go to  detail" data-toggle="tooltip" onclick="confirmDeleteZoom(' +
                item.id + ')"><i class="ti-trash m-1 text-danger" style="font-size:24px; cursor: pointer;"></i></a>' +
                '</td>' +
                '</tr>'
            )
        });
    }
    

function SearchQuestionRequest(questionName,examId,level,typeQuestion, pageSizeZoom, pageNumberZoom, sortBy, sortType){
this.questionName = questionName;
this.examId = examId;
this.level = level;
this.typeQuestion = typeQuestion;
this.page = pageNumberZoom;
this.size = pageSizeZoom;
this.sortField = sortBy;
this.sortType = sortType;
}
$(function () {
    console.log(13123)
    buildQuestionsPage();
    buildExamSearch();
})

function buildQuestionsPage() {
    zooms = [];
    getListQuesitons();
}

function buildExamSearch(){
    $.ajax({
        url: "http://localhost:8081/api/v1/exam",
        type: "GET",
        contentType: "application/json",
        //data: JSON.stringify(request),
        error: function (err) {
          console.log(err)
          confirm(err.responseJSON.message)
          alert("Error when loading data",err);
        },
        success: function (data) {
            console.log(data)
          fillExamsToSearch(data);
        }
      });
}

function fillExamsToSearch(data){
    $('#inputExam').empty();
    console.log(data);
    $('#inputExam').append('<option value="">Exam</option>')
    data.forEach(function (item) {
        $('#inputExam').append(
            `<option value="${item.id}">${item.examName}</option>`
            )});
}



// gọi api GetAllQuestions

async function getListQuesitons() {
    let request = new SearchQuestionRequest(questionName,examId,level, typeQuestion,pageSizeZoom, pageNumberZoom, sortBy, sortType);
    //   ------------------------------------- API TÌM KIẾM PRODUCT -------------------------------------
  $.ajax({
    url: baseUrlQuestions + "/search",
    type: "POST",
    
    contentType: "application/json",
    data: JSON.stringify(request),
    error: function (err) {
      console.log(err)
      confirm(err.responseJSON.message)
      alert("Error when loading data",err);
    },
    success: function (data) {
        console.log(data)
      fillQuestionsToTable(data.content);
      buildPaginationQuestion(data.number + 1, data.totalPages);
    }
  });

    
    // var url = "http://localhost:8080/api/v1/class?sortByClassName=true&sortByStartDate=true";
    // $.get(url, function (data, status) {
    //     //error
    //     if (status == "error") {
    //         alert("Error when loading data");
    //         return;
    //     }
    //     class_s = data;
    //     console.log(class_s);
    //     filltoTable();
    // });
    // fetch('./assets/data/zoom.json')
    //     .then((response) => response.json())
    //     .then((json) => {
    //         fillZoomToTable(json.content);
    //         buildPaginationZoom(json.number + 1, json.totalPages);
    //     }
    //     );
}

function searchQuestion(){
// Gans casc gti vao cac bien tim kiems
questionName = document.getElementById("searchName").value;

let inputLevel = document.getElementById("inputLevel").value;
level = inputLevel ? inputLevel : null ;

let inputTypeQuestion = document.getElementById("inputTypeQuestion").value;
typeQuestion = inputTypeQuestion ? inputTypeQuestion: null;

let inputExam = document.getElementById("inputExam").value;
examId = inputExam ? inputExam : 0;
console.log(questionName, level, typeQuestion, examId)
getListQuesitons();

}

function fillQuestionsToTable(json) {
    // check form trống để k lặp lại khi chuyền data
    $('#qnBody').empty();
    var index = 1;
    console.log(json);
    json.forEach(function (item) {
        $('#qnBody').append(
            '<tr>' +
            '<td>' + (index++) + '</td>' +
            '<td>' + item.qncontent + '</td>' +
            '<td>'+item.correct+'</td>' +
            '<td>' + item.exam.examName+ '</td>' +
            '<td>' + item.exam.level + '</td>' +
            '<td>' + item.typeQuestion + '</td>' +
            '<td>' +
            '<a class="edit" title="go to  detail" data-toggle="tooltip" onclick="editZoom(' +
            item.id + ')"><i class="ti-pencil m-1 text-warning" style="font-size:24px; cursor: pointer;"></i></a>' +
            '<a class="edit" title="go to  detail" data-toggle="tooltip" onclick="confirmDeleteZoom(' +
            item.id + ')"><i class="ti-trash m-1 text-danger" style="font-size:24px; cursor: pointer;"></i></a>' +
            '</td>' +
            '</tr>'
        )
    });
}

function buildPaginationQuestion(number, totalPages) {
    // kiểm tra nếu trang hiện tại là trang đầu -> disable đi

    if (number === 1) {
        $("#pagination-zoom").empty().append(
            `<li class="page-item">
            <a class="page-link disabled" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
            </a>
        </li>`);
    } else {
        $("#pagination-zoom").empty().append(
            `<li class="page-item">
            <a class="page-link" href="#" aria-label="Previous" onclick="prePageZoom()">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
            </a>
        </li>`);
    }

    // Dùng hàm for để build ra số trang. Kiểm tra xem trang hiện tại là bao nhiêu thì background vàng
    for (let index = 1; index <= totalPages; index++) {
        if (number === (index)) {
            $('#pagination-zoom').append(`<li class="page-item "><a class="page-link bg-primary" href="#" onclick="chosePageZoom(` + index + `)">`+index+`</a></li>`);
        } else {
            $('#pagination-zoom').append(`<li class="page-item"><a class="page-link" href="#" onclick="chosePageZoom(` + index + `)">`+index+`</a></li>`);
        }
    }

    // Kiểm tra nếu trang hiện tại là trang cuối -> disable đ
    if (number === totalPages) {
        $("#pagination-zoom").append(
            `<li class="page-item">
            <a class="page-link" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
            </a>
        </li>`);
    } else {
        $("#pagination-zoom").append(
            `<li class="page-item">
            <a class="page-link" href="#" aria-label="Next" onclick="nextPageZoom()">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
            </a>
        </li>`);
    }
}

function chosePageZoom(page) {
    event.preventDefault()
    pageNumberZoom = page;
    getListZoom();
}
function prePageZoom() {
    event.preventDefault()
    pageNumberZoom--;
    getListZoom();
}

function nextPageZoom() {
    event.preventDefault()
    pageNumberZoom++;
    getListZoom();
}

function addZoom() {
    resetFormEditZoom();
    $('#zoomModal').modal('show')
}

function editZoom(zoomId) {
    let zoom = zooms.find(zoom => zoom.id === zoomId)
    console.log(zoom);
    resetFormEditZoom();
    $('#zoomIdToSave').val(zoom.id);
    $('#zoomName').val(zoom.name);
    $("#linkZoom").val(zoom.link);
    $("#meetingId").val(zoom.meetingId);
    $("#passCode").val(zoom.passCode);
    $("#classUseZoom").append(zoom.class);
    $("#zoomDescription").val(zoom.description);

    $('#zoomModal').modal('show')
}

function saveZoom() {
    // Lấy các thông số để lưu
    let description = $("#zoomDescription").val();
    let id = $("#zoomIdToSave").val();
    let text = id ? "Update thành công" : "Thêm mới thành công"

    $('#zoomModal').modal('hide')
    showAlrtSuccess(text);

}

function resetFormEditZoom() {
    document.getElementById("zoomIdToSave").value = "";
    document.getElementById("zoomName").value = "";
    document.getElementById("linkZoom").value = "";
    document.getElementById("meetingId").value = "";
    document.getElementById("passCode").value = "";
    document.getElementById("classUseZoom").innerHTML = "";
    document.getElementById("zoomDescription").value = "";
}


function confirmDeleteZoom(zoomId) {
    $('#confirmDeleteZoom').modal('show')
    $('#zoomIdToDelete').val(zoomId)
}

function deleteZoom() {
    let zoomId = document.getElementById("zoomIdToDelete").value;
    console.log(zoomId);
    $('#confirmDeleteZoom').modal('hide')
    showAlrtSuccess("Xoá zoom thành công!");
}

