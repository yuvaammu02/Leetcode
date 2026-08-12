-- Last updated: 12/08/2026, 12:04:25
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle