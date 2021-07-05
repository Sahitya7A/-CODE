#include<stdio.h>
#include<stdlib.h>
struct node
{
    int x;
    struct node *next;
};
struct node *head=NULL,*p,*q;
void create(int data)
{
    struct node *temp=(struct node*)malloc(sizeof(struct node));
    temp->x=data;
    if(head==NULL)
    {
        head=(struct node*)malloc(sizeof(struct node));
        head=temp;
        head->next=NULL;
        p=head;
    }
    temp->next=NULL;
    p->next=temp;
    p=p->next;
}
void display()
{
    p=head;
    while(p!=NULL)
    {
        printf("%d\t",p->x);
        p=p->next;
    }
}
int main()
{
    create(5);
    create(7);
    create(1);
    display();
}
