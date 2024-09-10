$(document).ready(function(){
	var registerName = $('#registerName').val();
	if(registerName != "") {
		container.classList.add("right-panel-active");
	}

	var input = document.querySelector(".teleSelector");
  window.intlTelInput(input, {
    // formatOnDisplay: true,
    // // preferredCountries: ["sg", "id", "ph", "my"],
    // separateDialCode: true,
    utilsScript: "source/telephone-select/js/utils.js",
  });
})

const signUpButton = document.getElementById('signUp');
const btnRegister = document.getElementById('btnRegister');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
	console.log("Sign Up");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
	console.log("Sign in");
});


