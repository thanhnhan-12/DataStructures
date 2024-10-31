package DataStructures.Test;

public class Swap {
    public static void swapString() {
        // 5.
        // for(int i = 0; i < str.length() / 2; i++ ) {
        // swap(str[i], str[str.length() - i - 1] );
        // }

    }

    // 7.
    // int gcd(int a, int b) {
    // while(b != 0) {
    // int t = b;
    // b = a % b;
    // a = t;
    // }
    // return a;
    // }

    // 8.
    // int mode(int arr[], int n) {
    // unordered_map<int, int> freq;
    // for(int i = 0; i < n; i++) {
    // freq[arr[i]] ++ ;
    // }
    // int max_count = 0, mode = arr[0];
    // for(auto &pair : freq) {
    // if(pair.second > max_count) {
    // max_count = pair.second;
    // mode = pair.first;
    // }
    // }
    // return mode;
    // }

    // 11.
    // struct node
    // {
    // int data;
    // struct node* next;
    // }

    // static void reverse(struct node** head_ref )
    // {
    // struct node* prev = NULL;
    // struct node* current = *head_ref;
    // struct node* next;
    // while(current != NULL) {
    // next = current->next;
    // current->next = prev;
    // prev = current;
    // current = next;
    // }
    // /* ADD A STATEMENT HERE */
    // }

    // 12.
    // void traverse(struct Node *head)
    // {
    // while(head->next != NULL) {
    // printf("%d ", head->data);
    // head = head->next;
    // }
    // }

    // 14.
    // void printInorder(Struct Node* node) 
    // {
    //     if(node == NULL) 
    //         return;
        
    //     printInorder(node->left);
    //     cout << node->data << " ";
    //     printInorder(node->right);
    // }

    public static void main(String[] args) {

    }
}