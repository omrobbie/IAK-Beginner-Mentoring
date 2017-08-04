# GIT BASIC
Belajar syntax dasar git.

---

### Setting git pertama kali :
* `git config --global --list`
* `git config --global user.name [nama_kamu]`
* `git config --global user.email [email_kamu]`

### Setup git :
* `git init`
* `git clone [link_repo_origin]`

### Tambahkan link repo :
* `git remote -v`
* `git remote add [nama_repo] [link_repo_kamu]`
* `git remote add upstream [link_repo_kamu]`

### Buat branch baru :
* `git branch [nama_branch_baru]`
* `git checkout -b [nama_branch_baru]`

### Pindah antar branch :
* `git checkout [nama_branch]`

### Simpan perubahan :
* `git add .`
* `git commit -m "[deskripsi singkat kamu tentang commit yang kamu lakukan]"`

### Upload repo ke Internet :
* `git push [nama_repo] [nama_branch]`
* `git push origin master`

### Download repo dari Internet :
* `git pull [nama_repo] [nama_branch]`
* `git pull origin master`

### Informasi tambahan :
Untuk mempelajari syntax git yang lainnya, silahkan baca dokumentasinya dengan mengetikkan `git [nama_perintah] --help`. Atau untuk informasi lebih lengkap, silahkan kunjungi situs resmi [git-scm.com](https://git-scm.com/documentation "dokumentasi git").