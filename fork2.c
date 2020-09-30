#include <unistd.h>

#include <stdio.h>

#include <stdlib.h>

int main(){

pid_t c_pid;

int state;

c_pid = fork(); //duplicate

if( c_pid == 0 ){

//child: The return of fork() is zero

execl("./child", "child", (char *) 0);

} else if (c_pid > 0){//parent: The return of fork() is the process of id of the child

printf("Parent: I'm the parent: %d, I’m waiting...\n",c_pid);

wait(&state);//wait for the child to terminate

printf("Parent: Child terminated with the code %d\n",state);

} else{//error: The return of fork() is negative

perror("fork failed");

_exit(2); //exit failure, hard

}

}
