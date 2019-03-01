"use strict";

//打开页面运行函数    
$(function () {
    addRow();
});

//添加一行表格
var addRow = function () {
    $('tbody').append(
        "<tr>"
        + "<th scope=\"row\">"
        + rowNumber()
        + "</th>"
        + "<td><input class=\'fieldName\' style=\'width: 100%;\' type=\'text\'></td>"
        + "                    <td><select class=\'fieldSelect\' style=\'width: 100%;\'>"
        + "                            <option selected>varchar</option>"
        + "                            <option selected>char</option>"
        + "                            <option selected>int</option>"
        + "                            <option selected>tinyint</option>"
        + "                            <option selected>date</option>"
        + "                            <option selected>mediumint</option>"
        + "                        </select></td>"
        + "            <td><input class=\'fieldType\' style=\'width: 100%;\' type=\'text\'></td>"
        + "            <td><input class=\'fieldNull\' style=\'width: 100%;\' type=\'checkbox\'></td>"
        + "            <td><input class=\'fieldComment\' style=\'width: 100%;\' type=\'text\'></td>"
        + "</tr>"
    )
};

//增加一行表格生成函数
var defaultNumber = 0;
var rowNumber = function () {
    defaultNumber++;
    return defaultNumber;
};

//将表格数据封装在数组里，并转换为json对象
var packTableData = function () {
    //定义数组，存放表格数据
    var fieldArray = [];
    $('#sql_Table tbody tr').each(function (i) {
        //声明对象，单行数据
        var rowData = {};
        $(this).children('td').each(function (j) {
            //$(this).children().attr('class')，指各个单元格className
            var className = $(this).children().attr('class');
            //$(this).children().val() 表示各单元格属性值
            rowData[className] = $(this).children().val()
        });
        fieldArray.push(rowData)
    });
    return fieldArray;
};


// //添加一行表格
// var addRow = function () {
//     $('tbody').append(
//         "<tr>"
//         + "<th scope=\"row\">"
//         + rowNumber()
//         + "</th>"
//         + "<td><input class=\'input-block-level fieldName\' style=\'width: 100%;\' type=\'text\'></td>"
//         + "                    <td><select class=\'input-block-level fieldSelect\' style=\'width: 100%;\'>"
//         + "                            <option selected>varchar</option>"
//         + "                            <option selected>char</option>"
//         + "                            <option selected>int</option>"
//         + "                            <option selected>tinyint</option>"
//         + "                            <option selected>date</option>"
//         + "                            <option selected>mediumint</option>"
//         + "                        </select></td>"
//         + "            <td><input class=\'input-block-level fieldType\' style=\'width: 100%;\' type=\'text\'></td>"
//         + "            <td><input class=\"input-block-level fieldLength\" style=\"width: 100%;\" type=\"text\" placeholder=\"默认为0\"></td>"
//         + "            <td><input class=\'input-block-level fieldNull\' style=\'width: 100%;\' type=\'checkbox\'></td>"
//         + "            <td><input class=\'input-block-level fieldComment\' style=\'width: 100%;\' type=\'text\'></td>"
//         + "</tr>"
//     )
// };