package SingleResponsibility;

public class InvoiceRepository {
    public void saveInvoice(Invoice invoice){
        //Save invoice to database
    }
    public Invoice findById(int id) {
        return new Invoice();
    }
}
