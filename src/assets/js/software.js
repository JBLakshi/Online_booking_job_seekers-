$(document).ready(function () {
    $("body").on("change", "#selectDistric", function () {
        districval = $('#selectDistric').val();
        console.log(districval)

        if (districval == 'Trincomalee'){
            $('#trincojobs').show()
            $('#novacancy').hide()
        }else{
            $('#trincojobs').hide()
            $('#novacancy').show()
        }
    })
})