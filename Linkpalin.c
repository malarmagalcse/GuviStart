#include<stdio.h>
#include<malloc.h>

struct node {
    int data;
    struct node *link;
};

int append_source(struct node **source,int num) {
    struct node *temp,*r;
    temp = *source;
    if(temp == NULL) {
        temp = (struct node *) malloc(sizeof(struct node));
        temp->data = num;
        temp->link = NULL;
        *source = temp;
        return 0;
    }
    while(temp->link != NULL) 
        temp = temp->link;
    r = (struct node *) malloc(sizeof(struct node));
    r->data = num;
    temp->link = r;
    r->link = NULL;
    return 0;
}

int display(struct node *source) {
    struct node *temp = source;
    while(temp != NULL) {
        printf("list data = %d\n",temp->data);
        temp = temp->link;
    }
    return 0;
}

int copy_list(struct node **source, struct node **target) {
    struct node *sou = *source,*temp = *target,*r;
    while(sou != NULL) {
        if(temp == NULL) {
            temp = (struct node *) malloc(sizeof(struct node));
            temp->data = sou->data;
            temp->link = NULL;
            *target = temp;
        }
        else {
            while(temp->link != NULL) 
                temp = temp->link;
            r = (struct node *) malloc(sizeof(struct node));
            r->data = sou->data;
            temp->link = r;
            r->link = NULL;
        }
        sou = sou->link;
    }
    return 0;
}

int reverse_list(struct node **target) {
    struct node *head = *target,*next,*cursor = NULL;
    while(head != NULL) {
        next = head->link;
        head->link = cursor;
        cursor = head;
        head = next;
    }
    (*target) = cursor;
    return 0;
}

int check_pal(struct node **source, struct node **target) {
    struct node *sou = *source,*tar = *target;
    while( (sou) && (tar) ) {
        if(sou->data != tar->data) {
            printf("given linked list not a palindrome\n");
            return 0;
        }
        sou = sou->link;
        tar = tar->link;
    }
    printf("given string is a palindrome\n");
    return 0;
}

int remove_list(struct node *target) {
    struct node *temp;
    while(target != NULL) {
        temp = target;
        target = target->link;
        free(temp);
    }
    return 0;
}

int main()
{
    struct node *source = NULL, *target = NULL;
    append_source(&source,1);
    append_source(&source,2);
    append_source(&source,1);
    display(source);
    copy_list(&source, &target);
    display(target);
    reverse_list(&target);
    printf("list reversed\n");
    display(target);
    check_pal(&source,&target); 
    remove_list(target);
    return 0;
}
