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

**Every branch:** ми се бара да поминам низ секое ребро во графот, со што помалце број на тестови. Функцијата или враќа true или false. Според графот може да видиме дека во 4 случаеви имаме false, а само во еден true. Затоа направив 5 теста.  
- Првиот тест користам assertFalse, бидејќи функцијата ми враќе false. Односно ако User == null, функцијата не влага во првиот if и одма враќа false.  
- Вториот тест користам assertFalse, бидејќи функцијата враќе false. Односно ако user.username == null, функцијата не влага во вториот if и одма враќа false. 
- Третиот тест користам assertTrue, бидејќи функцијата враќa true. Праќам password којшто ги исполнува сите критериуми односно содржи специјален знак, голема буква и бројка. Што значи дека сите три booleans ќе бидат true и функцијата ќе врати true.  
- Четвртиот тест користам assertFalse, бидејќи функцијата враќе false. Односно ако должината на passwordot na userot e помала од 8, функцијата не влага во третиот if и одма враќа false.
- Петиот тест користам assertFalse, бидејќи функцијата враќа false. Односно ако passwordot на корисникот не содржи голема буква или специјален знак или бројка, тогаш последниот if е false и автоматски функцијата ми враќа false.

**Every path:** ми се бара да поминам низ сите можни патеки од почетокот на функцијата до крајот.  
1,2,3,22,23 - User == null, што значи функцијата враќа false и затоа правам тест со assertFalse.  

1,2,3,4,22,23 - user.getUsername() == null, што значи функцијата враќа false и затоа правам тест со assertFalse.  

1,2,3,4,5,6,7,22,23 - password.length < 8, што значи функцијаа враќа false и затоа правам тест со assertFalse.

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,9.3,9.2),17,22,23 - digit=true,upper=true,special=false, што значи дека функцијата враќа false бидејќи passwordot на корисникот не содржи специјален знак.  

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,13,14,15,9.3,9.2),17,18,23 - digit=true,upper=true,special=true, што значи дека функцијата враќа true бидејќи passwordot на корисникот ги исполнува сите критериуми. 

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,9.3,9.2),17,22,23 - digit=true,upper=false,special=false, што значи дека функцијата враќа false бидејќи passwordot на корисникот не содржи специјален знак и голема буква.  

1,2,3,4,5,6,7,8,9.1,9.2,(10,11,12,14,15,9.3,9.2),17,22,23 - digit=true,upper=false,special=true, што значи дека функцијата враќа false бидејќи passwordot на корисникот не содржи голема буква.  

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,9.3,9.2),17,22,23 - digit=false,upper=true,special=false, што значи дека функцијата враќа false бидејќи passwordot на корисникот не содржи бројка и специјален знак.  

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,13,14,15,9.3,9.2),17,22,23 - digit=false,upper=true,special=true, што значи дека функцијата враќа false бидејќи passwordot на корисникот не содржи бројка. 


1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,9.3,9.2),17,22,23 - digit=false,upper=false,special=false, што значи дека функцијата враќа false бидејќи passwordot на корисникот не содржи бројка,специјален знак и голема буква. 

1,2,3,4,5,6,7,8,9.1,9.2,(10,12,14,15,9.3,9.2),17,22,23 - digit=false,upper=false,special=false, што значи дека функцијата враќа false бидејќи passwordot на корисникот не содржи бројка и голема буква. 
