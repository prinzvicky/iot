import dropbox
dropbox_access_token= "sl.BKvBKbtKwKoQbsTHEk5TKGzBI7nIiEnXelPJHr0FQNtLagLID909vvtudQpyj3J2GmmQT3r8m_cDIWIb8q1BEjT271sOPR-GRybPxVRoF8kkYXqFh70D8nwPOoWGE0fLzREOs50oeq4U"
dropbox_path= "/sample.txt"
computer_path=r"E:\dropbox code\sample.txt"
client = dropbox.Dropbox(dropbox_access_token)
print("[SUCCESS] dropbox account linked")
client.files_upload(open(computer_path, "rb").read(), dropbox_path)
print("[UPLOADED] {}".format(computer_path))
metadata, f = client.files_download('/sample.txt')
out = open("sample_download.txt", 'wb')
out.write(f.content)
out.close()
print("[SUCCESS] downloaded")