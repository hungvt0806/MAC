let classList = [];
let pageSizeClass = 5;
let pageNumberClass = 1;
let sortBy_Class = "id";
let sortType_Class = "asc";

$(function () {
    buildClassPage();
    buildMentorToForm();
    buildClassRoomToForm();
    buildZoomToForm();
})


function buildClassPage() {
    classList = [];
    getListClass();
}


//  ----------------------------------------------------------------------------=
// gọi api GetAllClass
async function getListClass() {
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
    fetch('./assets/data/class.json')
        .then((response) => response.json())
        .then((json) => {
            filltoTable(json.content);
            buildPaginationClass(json.number + 1, json.totalPages);
        }
        );
}
function filltoTable(json) {
    if (json) {
        classList = json;
    }
    // check form trống để k lặp lại khi chuyền data
    $('#table-class').empty();
    var index = 1;
    console.log(classList);
    classList.forEach(function (item) {
        $('#table-class').append(
            '<tr>' +
            '<td>' + (index++) + '</td>' +
            '<td> ' + item.className + '</td>' +
            '<td>' + item.startDate + '</td>' +
            '<td>' + item.endDate + '</td>' +
            '<td>' + item.classStatus + '</td>' +
            '<td>' + item.studentNumber + '</td>' +
            '<td>' + item.teachingForm + '</td>' +
            // '<td>' + item.mentorName + '</td>' +
            '<td>' + item.description + '</td>' +

            '<td>' +
            '<a class="edit" title="go to  detail" data-toggle="tooltip" onclick="editClass(' +
            item.id + ')"><i class="ti-pencil m-1 text-warning" style="font-size:24px; cursor: pointer;"></i></a>' +
            '<a class="edit" title="go to  detail" data-toggle="tooltip" onclick="confirmDeleteClass(' +
            item.id + ')"><i class="ti-trash m-1 text-danger" style="font-size:24px; cursor: pointer;"></i></a>' +
            '<a class="edit" title="go to  detail" data-toggle="tooltip" onclick="viewStudent(' +
            item.id + ')"><i class="ti-search m-1 text-primary" style="font-size:24px; cursor: pointer;"></i></a>' +
            '</td>' +
            '</tr>'
        )
    });
}


function buildPaginationClass(number, totalPages) {
    // kiểm tra nếu trang hiện tại là trang đầu -> disable đi

    if (number === 1) {
        $("#pagination-class").empty().append(
            `<li class="page-item">
            <a class="page-link disabled" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
            </a>
        </li>`);
    } else {
        $("#pagination-class").empty().append(
            `<li class="page-item">
            <a class="page-link" href="#" aria-label="Previous" onclick="prePageClass()">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
            </a>
        </li>`);
    }

    // Dùng hàm for để build ra số trang. Kiểm tra xem trang hiện tại là bao nhiêu thì background vàng
    for (let index = 1; index <= totalPages; index++) {
        if (number === (index)) {
            $('#pagination-class').append(`<li class="page-item "><a class="page-link bg-primary" href="#" onclick="chosePageClass(` + index + `)">` + index + `</a></li>`);
        } else {
            $('#pagination-class').append(`<li class="page-item"><a class="page-link" href="#" onclick="chosePageClass(` + index + `)">` + index + `</a></li>`);
        }
    }

    // Kiểm tra nếu trang hiện tại là trang cuối -> disable đ
    if (number === totalPages) {
        $("#pagination-class").append(
            `<li class="page-item">
            <a class="page-link" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
            </a>
        </li>`);
    } else {
        $("#pagination-class").append(
            `<li class="page-item">
            <a class="page-link" href="#" aria-label="Next" onclick="nextPageClass()">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
            </a>
        </li>`);
    }
}

function chosePageClass(page) {
    event.preventDefault()
    pageNumberClass = page;
    getListClass();
}
function prePageClass() {
    event.preventDefault()
    pageNumberClass--;
    getListClass();
}

function nextPageClass() {
    event.preventDefault()
    pageNumberClass++;
    getListClass();
}

function addClass(){
    resetFromEditClass();
    $('#classModal').modal('show')
}

function editClass(classId){
    let class_ = classList.find(class_ => class_.id === classId)
    console.log(classList, class_);
    resetFromEditClass();
    $('#cl-id').val(class_.id);
    $('#cl-name').val(class_.className);
    $('#cl-startDate').val(new Date(class_.startDate).toISOString().substring(0, 10));
    $("#cl-endDate").val(new Date(class_.endDate).toISOString().substring(0, 10));
    $("#cl-classStatus").val(class_.classStatus);
    $("#cl-teachingForm").val(class_.teachingForm);
    $("#cl-mentor").val(class_.mentorId);
    $("#cl-classRoomId").val(class_.classRoomId);
    $("#cl-zoomId").val(class_.zoomId);
    $("#cl-information").val(class_.description);

    $('#classModal').modal('show')
}

function saveClass() {
    // Lấy các thông số để lưu
    let accountId = $('#cl-id').val();
    let username = $('#ac-username').val();
    let fullName = $('#ac-fullName').val();
    let dateOfBirth = $("#ac-birthDay").val();
    let phoneNumber = $("#ac-phoneNumber").val();
    let role = $("#ac-role").val();
    let address = $("#ac-address").val();
    let email = $("#ac-email").val();
    let facebook = $("#ac-facebook").val();
    let information = $("#ac-information").val();
    let classId = $("#ac-class").val();
// ---------------------------------- CALL API UPDATE OR CREATE ----------------------------------
    let text = accountId ? "Update Class thành công" : "Thêm mới Class thành công"

    $('#classModal').modal('hide')
    showAlrtSuccess(text);
}

function resetFromEditClass(){
    $('#ac-id').val("");
    $('#ac-username').val("");
    $('#ac-fullName').val("");
    $("#ac-birthDay").val("");
    $("#ac-phoneNumber").val("");
    $("#ac-role").val("STUDENT");
    $("#ac-address").append("");
    $("#ac-email").val("");
    $("#ac-facebook").val("");
    $("#ac-information").val("");
    $("#ac-class").val("");
}

function confirmDeleteClass(classId) {
    $('#confirmDeleteClass').modal('show')
    $('#classIdToDelete').val(classId)
}

function deleteClass() {
    let classId = document.getElementById("classIdToDelete").value;
    console.log(classId);
    $('#confirmDeleteClass').modal('hide')
// ---------------------------------- CALL API DELETE ----------------------------------
    showAlrtSuccess("Xoá account thành công!");
}

function viewStudent(classId){
    console.log(classId)
    // Call API lấy danh sách Account theo classId
    // fake
    fetch('./assets/data/account.json')
        .then((response) => response.json())
        .then((json) => {
            fillAccountToTable(json.content);
        }
        );
    $('#viewStudent').modal('show')
}

function fillAccountToTable(accounts){
    var index = 1;
    $('#table-account').empty()
    accounts.forEach(function (item) {
        $('#table-account').append(
            '<tr>' +
            '<td>' + (index++) + '</td>' +
            '<td>' + item.username + '</td>' +
            '<td>' + item.dateOfBirth + '</td>' +
            '<td>' + item.address + '</td>' +
            '<td>' + item.fullName + '</td>' +
            '<td>' + item.role + '</td>' +
            '<td>' + item.phoneNumber + '</td>' +
            '<td>' + item.email + '</td>' +
            '<td><a target="_blank" href=' + '"' + item.facebook + '"> ' + item.facebook + '<a/></td>' +
            '</tr>'
        )
    });
}

// ------------------------------ Build form add class ----------------------------------
function buildMentorToForm(){
    // -------------------- CALL API Get All Account is Mentor ----------------
    // Fake:
    fetch('./assets/data/account.json')
    .then((response) => response.json())
    .then((json) => {
        let data = json.content.filter(x => x.role === 'MENTOR');
        fillMentorToForm(data);
    }
    );
}

function fillMentorToForm(data){
    if(data){
        $('#cl-mentor').empty();
        data.forEach(function (item) {
            $('#cl-mentor').append(
                `<option value="`+item.id +`">`+item.fullName+`</option>`
            )
        });
    }
}

function buildClassRoomToForm(){
    // -------------------- CALL API Get All Class Room ----------------
    // Fake:
    fetch('./assets/data/class-room.json')
    .then((response) => response.json())
    .then((json) => {
        fillClassRoomToForm(json.content);
    }
    );
}

function fillClassRoomToForm(data){
    if(data){
        $('#cl-classRoomId').empty();
        data.forEach(function (item) {
            $('#cl-classRoomId').append(
                `<option value="`+item.id +`">`+item.name+`</option>`
            )
        });
    }
}

function buildZoomToForm(){
    // -------------------- CALL API Get All Zoom ----------------
    // Fake:
    fetch('./assets/data/zoom.json')
    .then((response) => response.json())
    .then((json) => {
        fillZoomToForm(json.content);
    }
    );
}

function fillZoomToForm(data){
    if(data){
        $('#cl-zoomId').empty();
        data.forEach(function (item) {
            $('#cl-zoomId').append(
                `<option value="`+item.id +`">`+item.name+`</option>`
            )
        });
    }
}