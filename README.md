# Втора лабораториска вежба по предметот Софтверско инженерство
## Војдан Ристовски, 185018

### Група на код :

Јас ја добив групата со број 4

### Control Flow Graph
Секоја линија во кодот на функцијата ми претставува node во Control flow graphot.

![controlFlowGraph](https://user-images.githubusercontent.com/62524190/84551674-9211aa00-ad0e-11ea-9841-ce95e8340afb.png)

### Цикломатска комплекност

Цикломатската комплексност ја добив преку формулата P + 1. P е бројот на предикатни јазли, во мојот случај P=8, што значи дека цикломатската комплексност е 9.

### Тест случаи според критериумот Every branch

![everyBranchTest](https://user-images.githubusercontent.com/62524190/84552263-6ee7fa00-ad10-11ea-8e23-aa501b134dc9.png)

### Тест случаи според критериумот Every path

Сите патеки:  
**() значи повторување, циклус**  

1,2,3,22,23

1,2,3,4,22,23

1,2,3,4,5,6,7,22,23

1,2,3,4,5,6,7,8,9.1,9.2,17,18,23 – ne moze da ne vlezeme vo forot (password.length <= 0), bidejki takva proverka pravime pogore vo funkcijata.

1,2,3,4,5,6,7,8,9.1,9.2,17,22,23 - ne moze da ne vlezeme vo forot (password.length <= 0), bidejki takva proverka pravime pogore vo funkcijata.

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,9.3,9.2),17,22,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,9.3,9.2),17,18,23 - ne moze funkcijata da bide true bidejki korisnikot nema specijalen znak vo negoviot password

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,15,9.3,9.2),17,22,23 - ne moze funkcijata da vrati false, bidejki korisnikot ima passsword so site ispolneti kriteriumi

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,15,9.3,9.2),17,18,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,9.3,9.2),17,22,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema golema bukva i specijalen znak vo negoviot password

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,15,9.3,9.2),17,22,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,15,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema golema bukva vo negoviot password

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,9.3,9.2),17,22,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema brojka i specijalen znak vo negoviot password

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,15,9.3,9.2),17,22,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,15,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema brojka vo negoviot password

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,9.3,9.2),17,22,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema brojka, golema bukva i specijalen znak vo negoviot password

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,15,9.3,9.2),17,22,23

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,15,9.3,9.2),17,18,23 - ne moze funkcijata da vrati true bidejki korisnikot nema golema bukva i brojka vo negoviot password

### Објаснување на напишаните unit tests
За Every branch тестот, ми се бара да поминам низ секое ребро во графот.
