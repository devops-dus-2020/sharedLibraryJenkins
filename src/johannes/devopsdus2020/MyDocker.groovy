package johannes.devopsdus2020

class MyDocker {
    IDockerService service
    public MyDocker(IDockerService service)
    {
        this.service = service
    }

    Boolean checkCredentials()
    {
        service.checkCredentials()
    }
}