#include <stdio.h>

 

int main(){

  int pid = getpid();

  printf("Child: I'm the child: %d\n", pid);

  sleep(2);//sleep 2 seconds

  printf("Child: Done.\n");

  return 0; //success                                                                                                                                                        

}
