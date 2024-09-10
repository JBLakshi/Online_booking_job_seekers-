$(document).ready(function() {

    $(".countrySelector").countrySelect({
        defaultCountry: "lk",
        preferredCountries: ["lk"],
        responsiveDropdown: true,
    });

    var input = document.querySelector(".teleSelector");
    window.intlTelInput(input, {
        formatOnDisplay: true,
        preferredCountries: ["lk"],
        separateDialCode: true,
        utilsScript: "../source/telephone-select/js/utils.js",
    });
})