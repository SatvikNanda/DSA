#include <stdio.h>
#include <stdlib.h>

struct node{
	int data;
	struct node* next;
};

struct node* head;

void Insert(int data){
	struct node* temp1=malloc(sizeof(struct node));
	temp1->data=data;
	if(head==NULL){
		temp1->next = head;
		head = temp1;
		return;
	}
	temp1->next = NULL;
	struct node* temp2 = head;
	while(temp2->next != NULL){
		temp2 = temp2->next;
	}
	temp1->next = temp2->next;
	temp2->next = temp1;
}

void Print(){
	if(head==NULL){
		printf("List is empty");
		return;
	}
	printf("List->");
	struct node* temp = head;
	while(temp!=NULL){
	    printf("%d->", temp->data);
		temp = temp->next;
	}
	printf("NULL\n");
}


void Delete(struct node *l){
	struct node* temp1 = l;
    if (temp1->next == NULL){
        printf("List is empty\n");
    }
    else
    {
        while(temp1->next->next!=NULL)
        temp1=temp1->next;
        temp1->next = NULL;
        Print();
    }
	// free(temp1);
	//return temp1;
}


int main(){
	head = NULL;
	int n;
	scanf("%d", &n);
	int arr[n];
	for(int i=0;i<n;i++){
		scanf("%d", &arr[i]);
	}
	for(int i=0;i<n;i++){
		Insert(arr[i]);
	}
	Print();
	printf("After Deletion\n");
	Delete(head);
	
}