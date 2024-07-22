
// 날짜
var today = new Date();
console.log(today);
console.log(today.getFullYear());
// today.setFullYear(1999);
// console.log(today);

// 오늘 날짜 찍기
// var str = today.getFullYear() + "년 " + (today.getMonth()+1) + "월 " + today.getDate() + "일";
// console.log(str);

var varYear = today.getFullYear() + "년 ";
// (0 ~ 11 사이의 값)
var varMonth = (today.getMonth() + 1) + "월 ";
var varDate = today.getDate() + "일 ";
// 일요일부터 (0 ~ 6 사이의 값)
var varDay = DayOfTheWeek(today.getDay());
console.log(varYear + varMonth + varDate + varDay);

function DayOfTheWeek(day)
{
    switch(day)
    {
        case 0:
            return "일요일";
            case 1:
                return "월요일";
                case 2:
                    return "화요일";
                    case 3:
                        return "수요일";
                        case 4:
                            return "목요일";
                            case 5:
                                return "금요일";
                                case 6:
                                    return "토요일";
    }
}

