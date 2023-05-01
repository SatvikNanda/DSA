#include <stdio.h>
#include <stdlib.h>

//step:1: make structure
struct node // a structure named node is created
{
    int data;
    struct node *next; // the structure contains a variable integer and a pointer next. 
};


// step:2 print the list before insertion
void display(struct node *head) // a function is used to display initial elements. First node of list is known as 'list' according to question
{
    if (head == NULL)
    {
        printf("NULL");
    }

    else
    {
        printf("%d->", head -> data);
        display(head -> next);
    }
    
}


// step:3 make function for inserting element at beginning
void deltarget(struct node **head, int T)
{
    struct node *p,*q,*r;
    
    p = malloc(sizeof(struct node));
    //p -> data = T;
    
    for(r=q=*head; q->next!=NULL && q->data!=T; r=r, q=q->next)
    {
        if(q->data == T)
        {
            r->next = p;
            p->next = q->next;
            free(q);
        }
        if(q->data != T && q->next == NULL)
        {
            printf("Target element not found\n");
        }
    }

}

// step:4 make main function
int main()
{
    struct node *prev,*head,*p;
    int N,i,X;

    scanf("%d", &N);

    head = NULL; // declaring head




    for (i = 0; i < N; i++)
    {
        p = malloc(sizeof(struct node));

        scanf("%d", &p ->data);

        p ->next = NULL;

        if (head == NULL)
        {
            head = p;
        }

        else
        {
            prev ->next = p;
            //prev = p;
        }
        prev = p;
        
    }

    int target;
    scanf("%d",&target);
    
    printf("List->");
    display(head);
    printf("\n");
    printf("After deletion");
    printf("\n");
    deltarget(&head,target);
    printf("List->");
    display(head);
    return 0;
    



}