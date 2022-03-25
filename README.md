# Observer Pattern
Simple notification application!
There are a notification push center. When it pushing any message, the clients that adding as observer receive simultaneously.

Assume that every single frame some client(your costumer phones, and tablets). So your message or notification should be diffrenet for every single devices. Thus i used;


- interface(Display) -> As your imagine :)
- interface(Observer)-> TV, Phone, Tablet
- interface(Subject) -> PresitendalOffice

When the client(user of TV, Phone, Tablet) unsubsrice, they dont receive any message because they removed from our observer list.

### UML Diagram
<img src= /src/screenshots/ss5.png width="676" height="438" >


### Screen Images 1

<img src= /src/screenshots/ss1.png width="950" height="700" >




### Screen Images 2

<img src=/src/screenshots/ss2.png width="950" height="700" >




### Screen Images 3

<img src=/src/screenshots/ss3.png width="950" height="700" >




### Screen Images 4

<img src=/src/screenshots/ss4.png width="950" height="700" >
