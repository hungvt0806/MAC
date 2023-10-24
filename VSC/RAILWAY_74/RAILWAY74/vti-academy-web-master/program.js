$(function () {
    let currentLocation = window.location.href;

    $(".main").load("./assets/html/Home.html");
    checkLogin();

})

function checkLogin() {
    let username = localStorage.getItem("username");
    let token = localStorage.getItem("token");
    let currentLocation = window.location.href;

    // if (!token && !currentLocation.includes("/login.html")) {
    //     window.location.href = '/login.html';
    // } else {
    //     document.getElementById("username-avatar").innerHTML = username;
    // }
}

// load trang home vvafo main
function onclickHomePage() {
    $(".main").load("./assets/html/Home.html");
}
// load trang create class vào main
function onclickCreateClass() {
    $(".main").load("./assets/html/Create-New-Class.html");
}
// load trang all class vào main
function onclickViewClass() {
    $(".main").load("./assets/html/class-page.html");
    changActivePage('class-page');
}



function navToQuestionCRUD() {
    $(".main").load("./assets/html/QuestionCRUD.html");
    changActivePage('questionCRUD');
}

function navToExamCRUD() {
    $(".main").load("./assets/html/ExamCRUD.html");
    changActivePage('examCRUD');
}




function navToClassRoomPage() {
    $(".main").load("./assets/html/questions.html");
    changActivePage('questions');
}

function navToAccountPage() {

    $(".main").load("./assets/html/account-page.html");
    changActivePage('forum-page');
}

function changActivePage(pageActive) {
    const navLinks = Array.from(document.getElementsByClassName("nav-link"));
    navLinks.forEach(element => element.classList.remove('acctive-link'))

    var navActive = document.getElementById(pageActive);
    navActive.classList.add('acctive-link');
    // navActive.classList.remove('text-dark')
}

function hideLogout() {
    $('#myModal').modal('show')
}

// logout
function Logout() {
    localStorage.clear();
    window.location.href = '/login.html';
}



function Login() {
    // call API from server
    //lay data tu model ra
    var username = document.getElementById("Username").value;
    var password = document.getElementById("Password").value;


    //khai báo employee dưới dạng json
    var admin = { username: username, password: password };
    console.log(admin);
    // var settings = {
    //     "url": "http://localhost:8080/api/v1/login",
    //     "method": "POST",
    //     "timeout": 0,
    //     "headers": {
    //         "Authorization": "",
    //         "Content-Type": "application/json"
    //     },
    //     "data": JSON.stringify({ "username": username, "password": password }),
    // };

    // $.ajax(settings).done(function (response) {
    //     console.log(response);
    //     if (response) {
    //         // lưu thông tin xuống localstorage
    //         // localStorage.setItem(username);
    //         location.replace("AdminWeb.html");
    //         return;
    //     } alert("Username or Passwword a wrong")
    // });
    if (username === "ADMIN" && password === "123456") {
        localStorage.setItem("username", username);
        localStorage.setItem("role", "ADMIN");
        localStorage.setItem("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c");
        window.location.href = '/index.html';
    } else {
        showAlrtError("Tài khoản hoặc mật khẩu không đúng");
    }

}

function showAlrtSuccess(content) {
    document.getElementById("conten-success-alert").innerHTML = content;
    $("#success-alert").fadeTo(2000, 500).slideUp(500, function () {
        $("#success-alert").slideUp(3000);
    });
}

function showAlrtError(content) {
    document.getElementById("content-error-alert").innerHTML = content;
    $("#error-alert").fadeTo(2000, 500).slideUp(500, function () {
        $("#error-alert").slideUp(3000);
    });
}

// var currentSubMenu = null; // Biến lưu submenu hiện tại

// function toggleSubMenu(submenuId) {
//     var submenu = document.getElementById(submenuId);

//     // Nếu submenu hiện tại không phải là submenu được nhấp vào
//     if (submenu !== currentSubMenu) {
//         // Ẩn submenu hiện tại (nếu có)
//         if (currentSubMenu) {
//             currentSubMenu.style.display = "none";
//         }

//         // Hiển thị submenu mới
//         submenu.style.display = "block";
//         currentSubMenu = submenu;
//     } else {
//         // Nếu submenu hiện tại đã là submenu được nhấp vào, ẩn nó
//         submenu.style.display = "none";
//         currentSubMenu = null;
//     }
// }
var currentSubMenu = null; // Biến lưu submenu hiện tại
var isHomeOrForumClicked = false; // Cờ cho biết liệu "Home" hoặc "Forum" đã được nhấp hay chưa

function toggleSubMenu(submenuId) {
    var submenu = document.getElementById(submenuId);

    if (submenu === currentSubMenu) {
        // Nếu submenu hiện tại đã mở, ẩn nó
        submenu.style.display = "none";
        currentSubMenu = null;
    } else {
        // Nếu submenu hiện tại không phải là submenu được nhấp vào
        if (currentSubMenu) {
            currentSubMenu.style.display = "none";
        }

        // Hiển thị submenu mới
        submenu.style.display = "block";
        currentSubMenu = submenu;

        // Đặt cờ "Home" hoặc "Forum" đã được nhấp
        isHomeOrForumClicked = false;
    }
}

let level;
let typeQuestion;
let baseUrlExams = "http://localhost:8081/api/v1/exam";

function navToExamsPage(level) {

    $(".main").load("./assets/html/exams-page.html");
    changActivePage('exams-page');
    // Gans casc gti vao cac bien tim kiems
    console.log(level)
    localStorage.setItem("level", level);
}





