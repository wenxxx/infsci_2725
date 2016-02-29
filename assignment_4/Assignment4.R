data=read.csv(file = "/Users/chunyao/Desktop/train.csv",header = TRUE,sep = ",")
df=data.frame(data)
library(ggplot2)
ggplot(df,aes(factor(Sex),Fare))+geom_boxplot(outlier.colour = "red",outlier.size = 3)+ggtitle("Sex in Comparsion with the Fare")

ggplot(df,aes(factor(Sex),fill=factor(Survived)))+geom_bar()+ggtitle("Sex in Survived")

ggplot(df,aes(Age,Sex,colour=factor(Survived)))+geom_point()+facet_grid(~Pclass)+ggtitle("In different classes, male and female at different age survived situation")

ggplot(df,aes(factor(Survived),Age,colour=Sex))+geom_violin()+ggtitle("Age distribution of saved and unsaved male and female")

ggplot(df, aes(Pclass,Age))+geom_tile(aes(fill=Survived))+scale_fill_gradient(low="steelblue",high = "Red")+ggtitle("The distribution of age of saved and unsaved passengers in different classes ")
