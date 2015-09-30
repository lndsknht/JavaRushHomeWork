package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable, Defensable
{
    private static int hitCount;

    public BodyPart attack()
    {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            attackedBodyPart =  BodyPart.ARM;
        } else if (hitCount == 2)
        {
            attackedBodyPart =  BodyPart.HEAD;
        } else if (hitCount == 3)
        {

            attackedBodyPart =  BodyPart.LEG;
        }
        else if (hitCount == 4)
        {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }

        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            defencedBodyPart =  BodyPart.HEAD;
        } else if (hitCount == 2)
        {
            defencedBodyPart =  BodyPart.LEG;
        } else if (hitCount == 3)
        {

            defencedBodyPart =  BodyPart.ARM;
        }
        else if (hitCount == 4)
        {
            hitCount = 0;
            defencedBodyPart = BodyPart.CHEST;
        }
        return defencedBodyPart;
    }
}

/* Битва роботов
1 Разобраться в том, что тут написано.
2 http://info.javarush.ru/uploads/images/00/00/07/2014/08/12/50f3e37f94.png
3 Смириться со своей участью и продолжить разбираться в коде.
4 ...
5 Порадоваться, что мы все поняли.

6 Изменить код согласно новой архитектуре и добавить новую логику:
6.1 Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
6.2 Отредактировать класс Robot учитывая AbstractRobot.
6.3 Расширить класс BodyPart новой частью тела "грудь".
6.4 Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).

7 http://info.javarush.ru/uploads/images/00/00/07/2014/08/12/3b9c65580b.png
*/