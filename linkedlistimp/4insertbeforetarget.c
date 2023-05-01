// INPUT: 1. Number of elements     2. ELEMENTS TO BE INSERTED      3. TARGET ELEMENT T     4. ELEMENT TO BE INSERTED X

#include<stdio.h>
#include<stdlib.h>

// step:1 make structure node
struct node // a structure named node is created
{
    int data;
    struct node *next; // the structure contains a variable integer and a pointer next. 
};


// step 2: display elements before insertion
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
int target;
struct node *p, *q, *r;

// step:3 make function to insert elements after the target element
void targetbefore(struct node **head,int T, int value)
{
    p = malloc(sizeof(struct node));
    p ->data = value;

    q = *head;
    for(r=q; q->next!=NULL && q->data!=T; q=q->next)
    {
        if(q->data == T)
        {
            r->next = p->next;
            p->next = q;
        }
        if(q->data != T && q->next == NULL)
        {
            printf("Target element not found\n");
        }
    }
    
}

// step 4

int main()
{
    struct node *prev,*head,*p;
    int N,i,X;

    scanf("%d", &N);

    head = NULL;



    
    for (i = 0; i < N; i++)
    {
        p = malloc(sizeof(struct node));
        scanf("%d", &p ->data);
        p ->next = NULL;

        
        if(head==NULL)
        {
            head = p;
        }
        
        else
        {
            prev -> next = p;
        }
        prev = p;
        
    }

    //int target;
    scanf("%d",&target);
    scanf("%d",&X);


    printf("List->");
    display(head);
    printf("\n");
    printf("After Insertion");
    printf("\n");
    targetbefore(&head,target,X);
    printf("List->");
    display(head);
    return 0;
}