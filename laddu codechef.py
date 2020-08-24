
# cook your dish here
T=int(input())
for i in range(T):
    st=input().split(" ")
    activities_num=int(st[0])
    ethi=st[1]
    activities=[]
    for _ in range(activities_num):
        st=input().split(" ")
        activities.append(st)
    laddus=0
    for act in activities:
        if(act[0]=='CONTEST_WON'):
            bonus=0
            if(int(act[1])<=20):
                bonus=20-int(act[1])
            laddus=laddus+300+bonus
        elif(act[0]=='TOP_CONTRIBUTOR'):
            laddus=laddus+300
        elif(act[0]=='BUG_FOUND'):
            laddus=laddus+int(act[1])
        elif(act[0]=='CONTEST_HOSTED'):
            laddus=laddus+50
        else:
            laddus=laddus+0
    if(ethi=='INDIAN'):
        print(int(laddus/200))
    else:
        print(int(laddus/400))