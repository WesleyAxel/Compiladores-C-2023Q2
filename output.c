#include <stdio.h>

int main()
{
int a,b,c;
float d;
a=1;
b=1;
c=1;
d=2.3;
printf("Programa Final");
printf("Digite A");
scanf("%d", &a);
printf("Digite B");
scanf("%d", &b);
if (b==20) {
 printf("b e igual a  20");
}
else {
printf("b e diferente de 20");
}
while (a<=10) {
printf("Digite A");
scanf("%d", &a);
}
do {
printf("Digite  B");
scanf("%d", &b);
} while (b<10); 
printf("A e igual a ");
printf("%d", a);
printf("B e igual a ");
printf("%d", b);
printf("C e igual a ");
printf("%d", c);
printf("D e igual a ");
printf("%f", d);

return 0;
}
