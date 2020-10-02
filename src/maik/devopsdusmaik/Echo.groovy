package maik.devopsdusmaik

class Echo {

    IEchoService echoservice; 

    public Echo(IEchoService service)
    {
        this.echoservice = service
    }

    public String Name(){
        return echoservice.Name()
    }
     
}