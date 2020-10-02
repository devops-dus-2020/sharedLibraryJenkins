package manuela.count

class CountKlasse {
    CountInterface countService
    public CountKlasse(CountInterface countService) {

            this.countService = countService

        }

        public int countFrom1() {

        return countService.counting()
    
    }

}