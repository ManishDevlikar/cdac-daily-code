namespace Patient;

public abstract class patient
{
    public long Id {get; internal set; }
    public string PatientName { get; protected set; }

    public int Days { get; protected set; }
}
